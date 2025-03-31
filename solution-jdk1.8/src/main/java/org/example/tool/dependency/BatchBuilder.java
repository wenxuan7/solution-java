package org.example.tool.dependency;

import com.google.common.base.Preconditions;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * 图 + 广度优先搜索
 */
@Slf4j
public class AnalysisGraph {

    /**
     * [3][2]
     * 3被2依赖
     */
    private final byte[][] graphView;

    private final List<String> projectPaths;

    private final Map<Byte, String> indexToProjectPath;

    private final Map<String, Byte> projectPathToIndex;

    public AnalysisGraph(List<String> projectPaths, Map<String, Set<String>> projectPathToDependencies) {
        Preconditions.checkArgument(projectPaths != null && !projectPaths.isEmpty());
        this.projectPaths = projectPaths;
        this.indexToProjectPath = new HashMap<>(this.projectPaths.size());
        this.projectPathToIndex = new HashMap<>(this.projectPaths.size());

        for (int i = 0; i < projectPaths.size(); i++) {
            String projectPath = projectPaths.get(i);
            this.indexToProjectPath.put(((byte) i), projectPath);
            this.projectPathToIndex.put(projectPath, ((byte) i));
        }

        this.graphView = new byte[projectPaths.size()][projectPaths.size()];
        for (byte[] bytes : this.graphView) {
            Arrays.fill(bytes, (byte) 0);
        }
        for (String projectPath : projectPathToDependencies.keySet()) {
            Preconditions.checkArgument(this.projectPathToIndex.containsKey(projectPath));
            byte index = this.projectPathToIndex.get(projectPath);

            Set<String> dependencies = projectPathToDependencies.get(projectPath);
            for (String dependency : dependencies) {
                Preconditions.checkArgument(this.projectPathToIndex.containsKey(dependency));
                byte dependencyIndex = this.projectPathToIndex.get(dependency);
                graphView[dependencyIndex][index] = 1;
            }
        }
    }

    public void build(List<String> changeProjectPaths) {
        List<Byte> indexes = new ArrayList<>(changeProjectPaths.size());
        for (String changeProjectPath : changeProjectPaths) {
            Preconditions.checkArgument(this.projectPathToIndex.containsKey(changeProjectPath));
            Byte index = this.projectPathToIndex.get(changeProjectPath);
            indexes.add(index);
        }

        // 广度优先搜索
        Set<Byte> visited = new HashSet<>(this.projectPaths.size());
        for (Byte index : indexes) {
            Deque<Byte> queue = new LinkedList<>();
            queue.addLast(index);
            visited.add(index);
            while (!queue.isEmpty()) {
                Byte tmp = queue.pollFirst();

                // 编译
                log.info("当前正在编译项目path:\n{}", this.indexToProjectPath.get(tmp));

                for (int i = 0; i < this.graphView[tmp].length; i++) {
                    byte c = this.graphView[tmp][i];
                    if (c == 0 || visited.contains(c)) {
                        continue;
                    }
                    queue.addLast((byte) i);
                    visited.add((byte) i);
                }
            }
        }
    }
}
