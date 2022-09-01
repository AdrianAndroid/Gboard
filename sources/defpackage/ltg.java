package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: ltg  reason: default package */
/* loaded from: classes.dex */
public final class ltg extends ltb {
    public static final ltf b = new ltf();

    public ltg(lun lunVar) {
        super(lunVar);
    }

    public static ltg i() {
        return new ltg(lvl.d(lvl.g().b(ltg.class)));
    }

    @Deprecated
    public static ltg j(String str) {
        lxj.c(!str.isEmpty(), "injected class name is empty");
        return new ltg(lvl.d(str.replace('/', '.')));
    }

    @Override // defpackage.ltb
    /* renamed from: h */
    public final ltd a(Level level) {
        boolean g = g(level);
        lvl.n(e(), level, g);
        return !g ? b : new lte(this, level);
    }
}
