package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: cyx  reason: default package */
/* loaded from: classes.dex */
final class cyx extends lls {
    @Override // defpackage.lls
    public final /* synthetic */ void a(Object obj, Object obj2) {
        super.a((String) obj, (String) obj2);
    }

    public final void b(String str, lfb lfbVar) {
        if (lfbVar.e()) {
            Object a = lfbVar.a();
            if (a instanceof String) {
                super.a(str, (String) a);
            } else if (a instanceof Integer) {
                c(str, (Integer) a);
            } else if (a instanceof jge) {
                super.a(str, ((jge) a).a);
            } else {
                throw new IllegalArgumentException(String.valueOf(a.getClass().getSimpleName()).concat(" type is not supported."));
            }
        }
    }

    public final void c(String str, Integer num) {
        super.a(str, String.valueOf(num));
    }

    public final void d(String str, String str2) {
        super.a(str, str2);
    }

    public final void e(Map map) {
        super.j(map);
    }
}
