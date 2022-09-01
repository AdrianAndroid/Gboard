package defpackage;

/* compiled from: PG */
/* renamed from: opa  reason: default package */
/* loaded from: classes2.dex */
public final class opa extends oqn {
    public final ora a;
    private final out b;
    private final String c;
    private final String d;

    public opa(ora oraVar, String str, String str2) {
        this.a = oraVar;
        this.c = str;
        this.d = str2;
        this.b = oix.e(new ooz(oraVar.a(1), oraVar));
    }

    @Override // defpackage.oqn
    public final long a() {
        try {
            String str = this.d;
            if (str == null) {
                return -1L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.oqn
    public final oqb b() {
        String str = this.c;
        if (str != null) {
            return oqb.a(str);
        }
        return null;
    }

    @Override // defpackage.oqn
    public final out c() {
        return this.b;
    }
}
