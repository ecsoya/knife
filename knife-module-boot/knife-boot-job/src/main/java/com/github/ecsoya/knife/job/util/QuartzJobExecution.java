package com.github.ecsoya.knife.job.util;

import org.quartz.JobExecutionContext;

import com.github.ecsoya.knife.job.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author AngryRED (angryred@qq.com)
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
