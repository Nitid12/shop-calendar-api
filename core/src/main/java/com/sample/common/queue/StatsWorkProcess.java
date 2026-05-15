package com.sample.common.queue;

import lombok.extern.slf4j.Slf4j;
import java.util.LinkedList;
import java.util.List;

@Slf4j
public class StatsWorkProcess {

    private StatsWorkLogic statsWorkLogic;

    private PoolWorker[] threads;

    private final LinkedList<TopicData> queue;

    public StatsWorkProcess() {
        this.queue = new LinkedList<>();
        bindThread();
    }

    /**
     * @param statsWorkLogic
     */
    public void getServiceLogic(StatsWorkLogic statsWorkLogic) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public void execute(String topic, Object payload) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public void execute(String topic, List<Object> payloadList) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private void makeThread() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    /**
     * MOID 수집 쓰레드 Run.
     */
    private class PoolWorker extends Thread {

        @Override
        public void run() {
            // TODO: 보안 정책상 비공개 처리된 로직입니다.
        }
    }

    /**
     * 쓰레드 바인드.
     */
    private void bindThread() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    /**
     * 특정 쓰레드 바인드.
     *
     * @param index 쓰레드 인덱스.
     */
    private void saveThread(int index) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public int getQueueSize() {
        return 0;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
