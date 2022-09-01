package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: jem  reason: default package */
/* loaded from: classes.dex */
public final class jem implements ind, inc {
    public volatile jek a;
    public volatile inc b;
    private final Context c;
    private final jee d;
    private final ind e;
    private final bob f;

    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public jem(Context context, bob bobVar, ind indVar) {
        this.c = context;
        jee jeeVar = new jee(context.getResources(), R.array.f1030_resource_name_obfuscated_res_0x7f030001);
        this.d = jeeVar;
        this.f = bobVar;
        this.e = indVar;
        this.a = new jek(context, indVar.a(), jeeVar);
    }

    @Override // defpackage.lgb
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.inc
    public final void b() {
        if (this.b != null) {
            this.b.b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.inc
    public final void c(SharedPreferences sharedPreferences) {
        gvt.a(this.a);
        this.a = new jek(this.c, this.e.a(), this.d);
        if (this.b != null) {
            this.b.c(sharedPreferences);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gvt.a(this.e);
        gvt.a(this.a);
    }

    @Override // defpackage.ind
    public final SharedPreferences.Editor d() {
        return this.a.b;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean g = jez.g(this.c);
        printer.println("isEnabled=" + g);
        boolean i = jez.i(this.c);
        printer.println("isRunningOnWorkProfile=" + i);
        if (Build.VERSION.SDK_INT >= 30) {
            boolean h = jez.h();
            printer.println("isEnvironmentCompatible=" + h);
            boolean f = jez.f(this.c);
            printer.println("hasWorkProfile=" + f);
            Context context = this.c;
            boolean z2 = false;
            if (jez.g(context) && jez.a(context).d()) {
                z2 = true;
            }
            printer.println("isWorkProfileEnabled=" + z2);
            boolean e = jez.e(this.c);
            printer.println("hasCrossProfilePermission=" + e);
        }
    }

    @Override // defpackage.ind
    public final String e() {
        return this.e.e();
    }

    @Override // defpackage.ind
    public final void f(inc incVar) {
        this.b = incVar;
    }

    @Override // defpackage.ind
    public final boolean g() {
        return this.e.g();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CrossProfileSharedPreferencesProvider";
    }
}
