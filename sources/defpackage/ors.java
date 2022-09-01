package defpackage;

/* compiled from: PG */
/* renamed from: ors  reason: default package */
/* loaded from: classes2.dex */
public final class ors extends oqn {
    private final String a;
    private final long b;
    private final out c;

    public ors(String str, long j, out outVar) {
        this.a = str;
        this.b = j;
        this.c = outVar;
    }

    @Override // defpackage.oqn
    public final long a() {
        return this.b;
    }

    @Override // defpackage.oqn
    public final oqb b() {
        String str = this.a;
        if (str != null) {
            return oqb.a(str);
        }
        return null;
    }

    @Override // defpackage.oqn
    public final out c() {
        return this.c;
    }
}
