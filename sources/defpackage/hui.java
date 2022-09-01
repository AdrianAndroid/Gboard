package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hui  reason: default package */
/* loaded from: classes.dex */
public final class hui {
    public static final hui[] a = new hui[0];
    public final ial[] b;

    public hui(ibl iblVar, iay iayVar, ial... ialVarArr) {
        iah iahVar = iah.PRESS;
        ibl iblVar2 = ibl.NONE;
        int ordinal = iblVar.ordinal();
        if (ordinal == 1) {
            this.b = r4;
            ial c = c(iah.PRESS, ialVarArr);
            ial[] ialVarArr2 = {c};
            if (c == null) {
                throw new NullPointerException("ActionDef for PRESS must be specified");
            }
        } else if (ordinal == 2) {
            this.b = (ial[]) Arrays.copyOf(ialVarArr, ialVarArr.length);
        } else {
            throw new AssertionError();
        }
        int b = b(iah.PRESS, this.b);
        if (b == Integer.MIN_VALUE) {
            return;
        }
        ial ialVar = this.b[b];
        iaj iajVar = new iaj();
        ialVar.g(iajVar);
        iajVar.c = new iay[]{iayVar};
        Object obj = iayVar.e;
        if (obj instanceof String) {
            iajVar.d = new String[]{(String) obj};
        }
        ial b2 = iajVar.b();
        ial[] ialVarArr3 = this.b;
        ialVarArr3[b] = b2 == null ? ialVarArr3[b] : b2;
    }

    public hui(ial... ialVarArr) {
        this.b = ialVarArr;
    }

    private static int b(iah iahVar, ial[] ialVarArr) {
        for (int i = 0; i < ialVarArr.length; i++) {
            if (ialVarArr[i].c == iahVar) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    private static ial c(iah iahVar, ial[] ialVarArr) {
        int b = b(iahVar, ialVarArr);
        if (b == Integer.MIN_VALUE) {
            return null;
        }
        return ialVarArr[b];
    }

    public final String a() {
        ial c = c(iah.PRESS, this.b);
        if (c == null) {
            return null;
        }
        Object obj = c.d().e;
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hui)) {
            return false;
        }
        if (obj != this) {
            return Arrays.equals(this.b, ((hui) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("actionDefs", Arrays.toString(this.b));
        return S.toString();
    }
}
