package defpackage;

/* compiled from: PG */
/* renamed from: ipt  reason: default package */
/* loaded from: classes.dex */
public final class ipt implements ipv {
    public final llw a;

    public ipt(llw llwVar) {
        this.a = llwVar;
    }

    public static boe j() {
        return new boe((byte[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.ipv
    public final long a(String str, long j) {
        Object obj = this.a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j;
    }

    @Override // defpackage.ipv
    public final nem b(String str, nem nemVar) {
        Object obj = this.a.get(str);
        return obj instanceof nem ? (nem) obj : nemVar;
    }

    @Override // defpackage.ipv
    public final boolean c(String str, ngf ngfVar) {
        Object obj = this.a.get(str);
        if (obj == null) {
            return false;
        }
        ngf ngfVar2 = ngf.VOID;
        switch (ngfVar.ordinal()) {
            case 1:
            case 8:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return obj instanceof nem;
            default:
                return false;
        }
    }

    @Override // defpackage.ipv
    public final boolean d(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @Override // defpackage.ipv
    public final double e(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ipt) {
            return this.a.equals(((ipt) obj).a);
        }
        return false;
    }

    @Override // defpackage.ipv
    public final int f(String str) {
        return h(str);
    }

    @Override // defpackage.ipv
    public final float g(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return 0.0f;
    }

    @Override // defpackage.ipv
    public final int h(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ipv
    public final String i(String str) {
        Object obj = this.a.get(str);
        return obj instanceof String ? (String) obj : "";
    }
}
