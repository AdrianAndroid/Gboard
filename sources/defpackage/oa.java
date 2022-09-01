package defpackage;

/* compiled from: PG */
/* renamed from: oa  reason: default package */
/* loaded from: classes2.dex */
final class oa extends aan {
    final /* synthetic */ int a;
    final /* synthetic */ ob b;
    private boolean c = false;

    public oa(ob obVar, int i) {
        this.b = obVar;
        this.a = i;
    }

    @Override // defpackage.aan, defpackage.aam
    public final void a() {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    @Override // defpackage.aan, defpackage.aam
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.aan, defpackage.aam
    public final void c() {
        this.c = true;
    }
}
