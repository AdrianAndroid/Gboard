package defpackage;

/* compiled from: PG */
/* renamed from: fcb  reason: default package */
/* loaded from: classes.dex */
public final class fcb {
    public static final hhl a = hhq.a("enable_voice_logging", false);
    private static volatile fcb b;

    private fcb() {
    }

    public static fcb a() {
        fcb fcbVar;
        fcb fcbVar2 = b;
        if (fcbVar2 != null) {
            return fcbVar2;
        }
        synchronized (fcb.class) {
            if (b == null) {
                b = new fcb();
            }
            fcbVar = b;
        }
        return fcbVar;
    }

    public final void b(fbm fbmVar) {
        CharSequence charSequence;
        if (!((Boolean) a.c()).booleanValue()) {
            return;
        }
        hpy b2 = hqj.b();
        ieh j = ieh.j();
        if (b2 == null || (charSequence = b2.c) == null || charSequence.length() == 0) {
            j.e(fbmVar, 0);
        } else {
            j.e(fbmVar, Integer.valueOf(b2.c.length()));
        }
    }
}
