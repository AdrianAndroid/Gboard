package defpackage;

/* compiled from: PG */
/* renamed from: cte  reason: default package */
/* loaded from: classes.dex */
public final class cte {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/metrics/ExpressionMetricsUtils");

    public static int a(hfl hflVar) {
        cmf cmfVar = cmf.UNKNOWN;
        mrs mrsVar = mrs.CANDIDATE_SOURCE_UNKNOWN;
        hfl hflVar2 = hfl.AUTOMATIC;
        int ordinal = hflVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return 2;
            }
            return ordinal != 4 ? 1 : 5;
        }
        return 4;
    }

    public static int b(cmf cmfVar) {
        cmf cmfVar2 = cmf.UNKNOWN;
        mrs mrsVar = mrs.CANDIDATE_SOURCE_UNKNOWN;
        hfl hflVar = hfl.AUTOMATIC;
        int ordinal = cmfVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 3;
            }
            if (ordinal == 3) {
                return 4;
            }
            if (ordinal == 4) {
                return 5;
            }
            return ordinal != 5 ? 1 : 6;
        }
        return 2;
    }

    public static int c(mse mseVar) {
        cmf cmfVar = cmf.UNKNOWN;
        mrs mrsVar = mrs.CANDIDATE_SOURCE_UNKNOWN;
        hfl hflVar = hfl.AUTOMATIC;
        mrs b = mrs.b(mseVar.m);
        if (b == null) {
            b = mrs.CANDIDATE_SOURCE_UNKNOWN;
        }
        switch (b.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 11;
            case 8:
                return 12;
            case 9:
                return 13;
            default:
                int i = mseVar.f;
                if ((131072 & i) > 0) {
                    return 8;
                }
                if ((i & 8) > 0) {
                    return 9;
                }
                ltd ltdVar = (ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/metrics/ExpressionMetricsUtils", "getModelType", 66, "ExpressionMetricsUtils.java");
                int b2 = msc.b(mseVar.c);
                if (b2 == 0) {
                    b2 = 1;
                }
                ltdVar.u("Failed to find model type for candidate %s", b2 - 1);
                return 1;
        }
    }
}
