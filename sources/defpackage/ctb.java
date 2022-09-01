package defpackage;

/* compiled from: PG */
/* renamed from: ctb  reason: default package */
/* loaded from: classes.dex */
public enum ctb implements ctc {
    TASK_FINISHED_SUCCESS(1),
    TASK_FINISHED_FAILURE(2),
    TASK_STARTED(3),
    TASK_SCHEDULED_FAILURE(4),
    TASK_RESCHEDULED_SCREEN_ON(5),
    TASK_SKIPPED(6),
    TASK_CANCELLED(7),
    TASK_CANCEL_FAILURE(8);
    
    private final int j;

    ctb(int i2) {
        this.j = i2;
    }

    @Override // defpackage.ctc
    public final int a() {
        return this.j;
    }
}
