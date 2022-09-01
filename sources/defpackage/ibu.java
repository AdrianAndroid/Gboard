package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Printer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ibu  reason: default package */
/* loaded from: classes.dex */
public final class ibu implements gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metadata/KeyboardDefManager");
    static final hhl b = hhq.f("keyboard_def_cache_size", 100);
    private static volatile ibu e;
    public final gwo c;
    private final Map f = new HashMap();
    public final qv d = new qv();

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, gwl] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ids, java.lang.Object] */
    private ibu(Context context) {
        gwp gwpVar = new gwp(ibm.CREATOR);
        int intValue = ((Long) b.c()).intValue();
        gwg a2 = gwj.a(context, "kb_def");
        a2.c();
        a2.b();
        orh orhVar = new orh(a2.a(), gwpVar);
        int[] iArr = {80, 60, 40, 15, 10, 5};
        for (int i = 0; i < 6; i++) {
            orhVar.b.add(Integer.valueOf(iArr[i]));
        }
        orhVar.a = intValue <= 0 ? Integer.MAX_VALUE : intValue;
        orhVar.d = ibq.a;
        orhVar.c = ich.LOAD_KEYBOARD_DEF_FROM_CACHE_FILE;
        this.c = new gwo(ieh.j(), orhVar.b, new gwk((gwj) orhVar.f, orhVar.e), new gwn(orhVar, orhVar.a, null), orhVar.c);
        gzt.a.a(this);
    }

    public static ibu a(Context context) {
        ibu ibuVar;
        ibu ibuVar2 = e;
        if (ibuVar2 != null) {
            return ibuVar2;
        }
        synchronized (ibu.class) {
            if (e == null) {
                e = new ibu(context.getApplicationContext());
            }
            ibuVar = e;
        }
        return ibuVar;
    }

    public final void b() {
        int i = 0;
        while (true) {
            qv qvVar = this.d;
            if (i < qvVar.d) {
                ((ibt) qvVar.f(i)).b.cancel(true);
                i++;
            } else {
                qvVar.clear();
                this.c.b();
                return;
            }
        }
    }

    public final void c(Context context, ibr ibrVar, int i, String str, jls jlsVar, ibw ibwVar, ibz ibzVar) {
        int[] iArr;
        hek hekVar = new hek(ibwVar, ibzVar);
        Map map = this.f;
        StringBuilder sb = new StringBuilder();
        Object obj = hekVar.b;
        if (obj != null) {
            for (int i2 : (int[]) obj) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(i2);
            }
        }
        sb.append('_');
        Configuration configuration = context.getResources().getConfiguration();
        sb.append(str);
        sb.append('_');
        sb.append(configuration.locale);
        sb.append('_');
        sb.append(i);
        sb.append('_');
        sb.append(configuration.orientation);
        sb.append((String) (jlsVar == null ? "" : jlsVar.b));
        String sb2 = sb.toString();
        String a2 = jbs.a(sb2);
        map.put(a2, sb2);
        ibt ibtVar = (ibt) this.d.get(a2);
        if (ibtVar == null || ibtVar.b()) {
            this.d.put(a2, new ibt(this, context, a2, ibrVar, jlsVar, hekVar, gxo.a(ibzVar == ibz.a ? 1 : 2), null, null));
        } else if (ibrVar != null) {
            ibtVar.a.add(ibrVar);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Hashed KeyboardDef cache file names and their original ones:");
        ArrayList B = lre.B(this.f.entrySet());
        int size = B.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) B.get(i);
            printer.println(((String) entry.getKey()) + " = " + ((String) entry.getValue()));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "KeyboardDefManager";
    }
}
