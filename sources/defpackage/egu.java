package defpackage;

/* compiled from: PG */
/* renamed from: egu  reason: default package */
/* loaded from: classes.dex */
public abstract class egu {
    public abstract cxc a();

    public abstract egt b();

    public abstract cxc c();

    public abstract cxf d();

    public final cxc e() {
        egt egtVar = egt.REGULAR_STICKER_PACK;
        int ordinal = b().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return a();
            }
            throw new IllegalStateException("Unsupported type");
        }
        return c();
    }
}
