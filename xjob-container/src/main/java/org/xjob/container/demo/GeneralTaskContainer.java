package org.xjob.container.demo;

import org.xjob.container.TaskContainer;
import org.xjob.task.demo.DemoJob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 写着玩的，仅供查看，参考都不行
 * @author Eightmonth
 * @param <Job> 任务类型
 */
public class GeneralTaskContainer<Job> extends ArrayList<Job> implements TaskContainer<Job> {

    public GeneralTaskContainer(){}

    public GeneralTaskContainer(int initialCapacity) {
        super(initialCapacity);
    }

    public GeneralTaskContainer(Collection<? extends Job> c) {
        super(c);
    }


    @Override
    public void failBack(Job job) {
        add(job);
    }

    @Override
    public List<Job> pullTask(int size) {
        List<Job> jobs = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            jobs.add(remove(0));
        }
        return jobs;
    }
}
