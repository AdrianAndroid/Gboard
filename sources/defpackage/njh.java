package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: njh  reason: default package */
/* loaded from: classes2.dex */
public enum njh implements nfp {
    EXEC_NAME_UNKNOWN(0),
    EXEC_NAME_BASELINE_EVAL(1),
    EXEC_NAME_P13N_TRAIN(2),
    EXEC_NAME_P13N_TRAIN_PER_EPOCH(3),
    EXEC_NAME_P13N_EVAL(4),
    EXEC_NAME_REGRESSION_EVAL(5),
    EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA(6),
    EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA(7),
    EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL(8),
    EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL(9),
    EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL(10),
    EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL(11),
    EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL(12);
    
    public final int n;

    njh(int i) {
        this.n = i;
    }

    public static njh b(int i) {
        switch (i) {
            case 0:
                return EXEC_NAME_UNKNOWN;
            case 1:
                return EXEC_NAME_BASELINE_EVAL;
            case 2:
                return EXEC_NAME_P13N_TRAIN;
            case 3:
                return EXEC_NAME_P13N_TRAIN_PER_EPOCH;
            case 4:
                return EXEC_NAME_P13N_EVAL;
            case 5:
                return EXEC_NAME_REGRESSION_EVAL;
            case 6:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA;
            case 7:
                return EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA;
            case 8:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL;
            case 9:
                return EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL;
            case 10:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL;
            case 11:
                return EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mxe.m;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
