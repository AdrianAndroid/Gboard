package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: jcg  reason: default package */
/* loaded from: classes.dex */
public class jcg implements ijh {
    public final llw a;

    private jcg(llw llwVar) {
        this.a = llwVar;
    }

    public static void b(String str, jbz jbzVar) {
        synchronized (jcg.class) {
            jcg jcgVar = (jcg) ijl.b().a(jcg.class);
            if (jcgVar == null) {
                ijl.b().g(new jcg(llw.l(str, jbzVar)));
            } else {
                ijl b = ijl.b();
                lls i = llw.i(jcgVar.a.size() + 1);
                i.a(str, jbzVar);
                i.j(jcgVar.a);
                b.g(new jcg(i.l()));
            }
        }
    }

    public static void c(String str) {
        synchronized (jcg.class) {
            jcg jcgVar = (jcg) ijl.b().a(jcg.class);
            if (jcgVar != null && jcgVar.a.containsKey(str)) {
                llw j = llw.j(lre.Z(jcgVar.a.entrySet(), new jcf(str, 0)));
                if (j.isEmpty()) {
                    ijl.b().e(jcg.class);
                } else {
                    ijl.b().g(new jcg(j));
                }
            }
        }
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Active VoiceInputHandlerFactory: ".concat(String.valueOf(String.valueOf(this.a))));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "VoiceInputHandlerFactoryNotification";
    }
}
