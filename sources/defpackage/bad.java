package defpackage;

/* compiled from: PG */
/* renamed from: bad  reason: default package */
/* loaded from: classes.dex */
public final class bad implements azn {
    public static final auz a = auz.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final aqq b;

    public bad() {
        this(null, null, null);
    }

    public bad(aqq aqqVar, byte[] bArr, byte[] bArr2) {
        this.b = aqqVar;
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        aze azeVar = (aze) obj;
        return true;
    }

    @Override // defpackage.azn
    public final /* bridge */ /* synthetic */ fws b(Object obj, int i, int i2, ava avaVar) {
        aze azeVar = (aze) obj;
        aqq aqqVar = this.b;
        azm b = azm.b(azeVar);
        Object f = ((bgf) aqqVar.a).f(b);
        b.a();
        aze azeVar2 = (aze) f;
        if (azeVar2 == null) {
            aqq aqqVar2 = this.b;
            ((bgf) aqqVar2.a).g(azm.b(azeVar), azeVar);
        } else {
            azeVar = azeVar2;
        }
        return new fws(azeVar, new avs(azeVar, ((Integer) avaVar.b(a)).intValue()));
    }
}
