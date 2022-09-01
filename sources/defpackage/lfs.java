package defpackage;

/* compiled from: PG */
/* renamed from: lfs  reason: default package */
/* loaded from: classes.dex */
final class lfs extends ldv {
    final /* synthetic */ lfu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfs(lfu lfuVar, lfy lfyVar, CharSequence charSequence, byte[] bArr) {
        super(lfyVar, charSequence);
        this.g = lfuVar;
    }

    @Override // defpackage.ldv
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.ldv
    public final int b(int i) {
        return ((lek) this.g.a).d(this.b, i);
    }
}
