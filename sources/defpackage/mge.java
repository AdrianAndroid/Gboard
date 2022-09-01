package defpackage;

/* compiled from: PG */
/* renamed from: mge  reason: default package */
/* loaded from: classes.dex */
public enum mge implements nfp {
    ERROR_REASON_UNSPECIFIED(0),
    ERROR_REASON_JOB_SCHEDULER(1),
    ERROR_REASON_FILE_DELETION(2),
    ERROR_REASON_IO_EXCEPTION(3),
    ERROR_REASON_RUNTIME_EXCEPTION(4);
    
    public final int f;

    mge(int i) {
        this.f = i;
    }

    public static mge b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ERROR_REASON_JOB_SCHEDULER;
            }
            if (i == 2) {
                return ERROR_REASON_FILE_DELETION;
            }
            if (i == 3) {
                return ERROR_REASON_IO_EXCEPTION;
            }
            if (i == 4) {
                return ERROR_REASON_RUNTIME_EXCEPTION;
            }
            return null;
        }
        return ERROR_REASON_UNSPECIFIED;
    }

    public static nfq c() {
        return mdw.t;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
