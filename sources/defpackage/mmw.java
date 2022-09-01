package defpackage;

/* compiled from: PG */
/* renamed from: mmw  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmw implements moi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mmw(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public /* synthetic */ mmw(mmu mmuVar, int i) {
        this.b = i;
        this.a = mmuVar;
    }

    @Override // defpackage.moi
    public final Object a() {
        return this.b != 0 ? msc.o((String) this.a) : this.a;
    }
}
