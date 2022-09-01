package defpackage;

/* compiled from: PG */
/* renamed from: awu  reason: default package */
/* loaded from: classes.dex */
public final class awu implements bgm {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public awu(awv awvVar, int i) {
        this.b = i;
        this.a = awvVar;
    }

    public awu(knf knfVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = knfVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [xx, java.lang.Object] */
    @Override // defpackage.bgm
    public final /* synthetic */ Object a() {
        if (this.b == 0) {
            awv awvVar = (awv) this.a;
            return new awz(awvVar.a, awvVar.b, awvVar.c, awvVar.e, awvVar.f, awvVar.d, null, null);
        }
        knf knfVar = (knf) this.a;
        return new awo((bnc) knfVar.c, knfVar.b, null);
    }
}
