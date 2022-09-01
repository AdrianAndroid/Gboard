package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* renamed from: cby  reason: default package */
/* loaded from: classes.dex */
public final class cby {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/LmManager");
    private static volatile cby d;
    public final cfd b;
    public final bzv c;
    private final Context e;

    public cby(Context context, cfd cfdVar) {
        this.e = context;
        this.b = cfdVar;
        this.c = new bzv(cfdVar);
    }

    public static cby a(Context context) {
        cby cbyVar = d;
        if (cbyVar == null) {
            synchronized (cby.class) {
                cbyVar = d;
                if (cbyVar == null) {
                    cbyVar = new cby(context, cfd.b(context));
                    d = cbyVar;
                }
            }
        }
        return cbyVar;
    }

    public static List c(List list) {
        cdx cdxVar = cdx.a;
        if (cdxVar == null) {
            return list;
        }
        Stream stream = Collection$EL.stream(list);
        Objects.requireNonNull(cdxVar);
        return (List) stream.map(new chd(cdxVar, 1)).collect(Collectors.toCollection(cag.c));
    }

    public final cca b(List list, String str, int i) {
        cbh cewVar;
        if (!((Boolean) cas.d.c()).booleanValue()) {
            cewVar = new cew(this.e, ieh.j(), str);
        } else {
            cewVar = new ceh(this.e, str);
        }
        Context context = this.e;
        return new cca(context, Delight5Facilitator.h(context), cewVar, ieh.j(), list, i);
    }

    public final void d() {
        kcu.U(this.b.f(), new cbx(0), mjl.a);
    }

    public final void e() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/LmManager", "asyncUpdateEnabledLanguageModels", 89, "LmManager.java")).t("asyncUpdateEnabledLanguageModels()");
        this.b.k(false);
        this.b.l();
    }
}
