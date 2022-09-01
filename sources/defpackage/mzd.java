package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mzd  reason: default package */
/* loaded from: classes2.dex */
public enum mzd implements nfp {
    HISTOGRAM_COUNTER_UNDEFINED(0),
    TRAINING_RUN_PHASE_LATENCY(1),
    TRAINING_RUN_PHASE_END_TIME(2),
    TRAINING_RESTORE_STATE_LATENCY(3),
    TRAINING_RUN_CLIENT_EXECUTION_LATENCY(4),
    TRAINING_INIT_OP_LATENCY(5),
    TRAINING_BEFORE_OP_LATENCY(6),
    TRAINING_AFTER_OP_LATENCY(7),
    TRAINING_RUN_EPOCH_LATENCY(8),
    TRAINING_GATHER_MINI_BATCH_LATENCY(9),
    TRAINING_RUN_MINI_BATCH_LATENCY(10),
    TRAINING_INTERRUPT_TERMINATION_LATENCY(11),
    TRAINING_OPSTATS_COMMIT_LATENCY(12),
    TRAINING_OVERALL_EXAMPLE_COUNT(100001),
    TRAINING_OVERALL_EXAMPLE_SIZE(100002),
    TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT(100003),
    TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE(100004),
    TRAINING_EPOCH_EXAMPLE_COUNT(100005),
    TRAINING_EPOCH_EXAMPLE_SIZE(100006),
    TRAINING_MINI_BATCH_EXAMPLE_COUNT(100007),
    TRAINING_MINI_BATCH_EXAMPLE_SIZE(100008),
    OPSTATS_DB_SIZE_BYTES(100009),
    OPSTATS_DB_NUM_ENTRIES(100010),
    OPSTATS_NUM_PRUNED_ENTRIES(100011),
    OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS(100012),
    TRAINING_FL_CHECKIN_LATENCY(200001),
    TRAINING_FL_REPORT_RESULTS_END_TIME(200002),
    TRAINING_FL_REPORT_RESULTS_LATENCY(200003),
    TRAINING_FL_CHECKIN_END_TIME(200004),
    TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY(200005),
    UNRECOGNIZED(-1);
    
    private final int F;

    mzd(int i) {
        this.F = i;
    }

    public static mzd b(int i) {
        switch (i) {
            case 0:
                return HISTOGRAM_COUNTER_UNDEFINED;
            case 1:
                return TRAINING_RUN_PHASE_LATENCY;
            case 2:
                return TRAINING_RUN_PHASE_END_TIME;
            case 3:
                return TRAINING_RESTORE_STATE_LATENCY;
            case 4:
                return TRAINING_RUN_CLIENT_EXECUTION_LATENCY;
            case 5:
                return TRAINING_INIT_OP_LATENCY;
            case 6:
                return TRAINING_BEFORE_OP_LATENCY;
            case 7:
                return TRAINING_AFTER_OP_LATENCY;
            case 8:
                return TRAINING_RUN_EPOCH_LATENCY;
            case 9:
                return TRAINING_GATHER_MINI_BATCH_LATENCY;
            case 10:
                return TRAINING_RUN_MINI_BATCH_LATENCY;
            case 11:
                return TRAINING_INTERRUPT_TERMINATION_LATENCY;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return TRAINING_OPSTATS_COMMIT_LATENCY;
            default:
                switch (i) {
                    case 100001:
                        return TRAINING_OVERALL_EXAMPLE_COUNT;
                    case 100002:
                        return TRAINING_OVERALL_EXAMPLE_SIZE;
                    case 100003:
                        return TRAINING_CLIENT_EXECUTION_EXAMPLE_COUNT;
                    case 100004:
                        return TRAINING_CLIENT_EXECUTION_EXAMPLE_SIZE;
                    case 100005:
                        return TRAINING_EPOCH_EXAMPLE_COUNT;
                    case 100006:
                        return TRAINING_EPOCH_EXAMPLE_SIZE;
                    case 100007:
                        return TRAINING_MINI_BATCH_EXAMPLE_COUNT;
                    case 100008:
                        return TRAINING_MINI_BATCH_EXAMPLE_SIZE;
                    case 100009:
                        return OPSTATS_DB_SIZE_BYTES;
                    case 100010:
                        return OPSTATS_DB_NUM_ENTRIES;
                    case 100011:
                        return OPSTATS_NUM_PRUNED_ENTRIES;
                    case 100012:
                        return OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS;
                    default:
                        switch (i) {
                            case 200001:
                                return TRAINING_FL_CHECKIN_LATENCY;
                            case 200002:
                                return TRAINING_FL_REPORT_RESULTS_END_TIME;
                            case 200003:
                                return TRAINING_FL_REPORT_RESULTS_LATENCY;
                            case 200004:
                                return TRAINING_FL_CHECKIN_END_TIME;
                            case 200005:
                                return TRAINING_FL_ELIGIBILITY_EVAL_CHECKIN_LATENCY;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // defpackage.nfp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.F;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
