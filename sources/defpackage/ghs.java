package defpackage;

/* compiled from: PG */
/* renamed from: ghs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ghs implements ghq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ghs(ghr ghrVar, int i) {
        this.b = i;
        this.a = ghrVar;
    }

    public /* synthetic */ ghs(gmi gmiVar, int i, byte[] bArr) {
        this.b = i;
        this.a = gmiVar;
    }

    @Override // defpackage.ghq
    public final void a(int i) {
        ghr ghrVar;
        if (this.b != 0) {
            Object obj = this.a;
            int i2 = i - 1;
            if (i2 == 1) {
                ghrVar = (ghr) obj;
                ghrVar.c = 2;
            } else if (i2 != 3) {
                ghrVar = (ghr) obj;
                if (ghrVar.c != 2) {
                    return;
                }
                ghrVar.c = 3;
            } else {
                ghrVar = (ghr) obj;
                ghrVar.c = 4;
            }
            ghrVar.c();
            return;
        }
        throw null;
    }
}
