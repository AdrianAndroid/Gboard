package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lug  reason: default package */
/* loaded from: classes.dex */
public final class lug extends lue {
    public lug(lun lunVar) {
        super(lunVar);
    }

    public static lug i(String str) {
        return new lug(lvl.d(str));
    }

    public static lug j(String str) {
        return new lug(lwc.c.a(str));
    }

    @Override // defpackage.ltb
    /* renamed from: h */
    public final luc a(Level level) {
        boolean g = g(level);
        lvl.n(e(), level, g);
        return !g ? b : new luf(this, level);
    }
}
