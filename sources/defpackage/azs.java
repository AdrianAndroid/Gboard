package defpackage;

/* compiled from: PG */
/* renamed from: azs  reason: default package */
/* loaded from: classes.dex */
public final class azs implements azn {
    public static final azs a = new azs(2, null);
    private final /* synthetic */ int b;

    public azs(int i) {
        this.b = i;
    }

    @Deprecated
    public azs(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.azn
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return obj.toString().startsWith("data:image");
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.azn
    public final fws b(Object obj, int i, int i2, ava avaVar) {
        int i3 = this.b;
        if (i3 != 0) {
            return i3 != 1 ? new fws(new bfu(obj), new azx(obj, 0)) : new fws(new bfu(obj), new ayy(obj.toString()));
        }
        return null;
    }
}
