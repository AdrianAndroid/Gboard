package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Printer;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ivr  reason: default package */
/* loaded from: classes.dex */
public final class ivr implements ivt, hhk {
    public final Context c;
    public final hyy d;
    public final hze e;
    public final Executor f;
    public final idk g;
    public final kqr h;
    private final ivn j;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager");
    private static final Pattern i = Pattern.compile("^[a-zA-Z0-9-_]{1,40}$");
    public static final hic b = hhq.k("lc_task_config_list", mxd.b);

    static {
        hhq.a("lc_testing_mode", false);
    }

    public ivr(Context context, hyy hyyVar, hze hzeVar, ivn ivnVar, Executor executor, idk idkVar) {
        this.c = context;
        this.d = hyyVar;
        this.e = hzeVar;
        this.f = executor;
        this.j = ivnVar;
        kor a2 = kos.a(context);
        a2.d("lc_task_manager");
        a2.e("lc_config_list.pb");
        Uri a3 = a2.a();
        kqg a4 = kqh.a();
        a4.f(a3);
        a4.e(mxd.b);
        this.h = ift.a().a(a4.a());
        this.g = idkVar;
    }

    static fwm c(mxc mxcVar) {
        String str = mxcVar.b;
        mxb mxbVar = mxcVar.d;
        if (mxbVar == null) {
            mxbVar = mxb.d;
        }
        String str2 = mxbVar.b;
        String concat = "NEBULAE_LC-".concat(String.valueOf(mxcVar.b));
        fwl a2 = fwm.a();
        a2.e(concat);
        a2.a = concat.hashCode();
        mxf mxfVar = mxcVar.c;
        if (mxfVar == null) {
            mxfVar = mxf.c;
        }
        int t = jco.t(mxfVar.a);
        if (t == 0) {
            t = 1;
        }
        a2.c = fyb.d(t - 1, mxfVar.b);
        a2.d(kki.I(str, str2), kki.H(str, str2), Uri.parse(mhr.a("appfiles:/nebulae/lc", str, str2, "output")));
        a2.b(mxcVar.q());
        return a2.a();
    }

    public static llw d(mxd mxdVar) {
        HashMap hashMap = new HashMap();
        for (mxc mxcVar : mxdVar.a) {
            if (i.matcher(mxcVar.b).find()) {
                if (hashMap.put(mxcVar.b, mxcVar) != null) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "getIdConfigMap", 426, "LocalComputationTaskManager.java")).w("Local computation task config %s already existed", mxcVar.b);
                }
            } else {
                ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "getIdConfigMap", 422, "LocalComputationTaskManager.java")).w("Invalid task id: %s", mxcVar.b);
            }
        }
        return llw.k(hashMap);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    final mko e() {
        return hiz.k(this.h.a()).u(new iul(this, 4), this.f).v(new ivo(this, 0), mjl.a);
    }

    public final void f(mxc mxcVar) {
        fwm c = c(mxcVar);
        ivn ivnVar = this.j;
        hiz.k(ivnVar.a(c)).v(cex.f, ivnVar.b).F(new hyw(c, 10), ivnVar.b);
        this.g.e(iwc.LC_TRAINER_CANCELED, mxcVar.b);
    }

    public final void g(mxc mxcVar) {
        fwm c = c(mxcVar);
        ivn ivnVar = this.j;
        hiz.k(ivnVar.a(c)).v(cex.g, ivnVar.b).F(new hyw(c, 9), ivnVar.b);
        this.g.e(iwc.LC_TRAINER_SCHEDULED, mxcVar.b);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        hiz.k(e()).u(new iul(this, 5), mjl.a).F(new ivq(0), mjl.a);
        b.f(this, this.f);
    }

    @Override // defpackage.ifw
    public final void gn() {
        b.g(this);
    }

    public final void h(mxc mxcVar) {
        Context context = this.c;
        String str = mxcVar.b;
        mxb mxbVar = mxcVar.d;
        if (mxbVar == null) {
            mxbVar = mxb.d;
        }
        File file = new File(ker.k(context, kki.H(str, mxbVar.b)), "custom_config.pb");
        if ((mxcVar.a & 16) == 0) {
            jan.b.e(file);
            return;
        }
        jan janVar = jan.b;
        ndy ndyVar = mxcVar.f;
        if (ndyVar == null) {
            ndyVar = ndy.c;
        }
        janVar.k(ndyVar.b.D(), file);
    }

    public final void i(mxc mxcVar) {
        Context context = this.c;
        String str = mxcVar.b;
        mxb mxbVar = mxcVar.d;
        if (mxbVar == null) {
            mxbVar = mxb.d;
        }
        File file = new File(ker.k(context, kki.H(str, mxbVar.b)), "resumption_token.pb");
        if ((mxcVar.a & 32) == 0) {
            jan.b.e(file);
            return;
        }
        jan janVar = jan.b;
        ndy ndyVar = mxcVar.g;
        if (ndyVar == null) {
            ndyVar = ndy.c;
        }
        janVar.l(file, ndyVar);
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        kcu.U(e(), new ivq(2), this.f);
    }

    public final boolean j(mxc mxcVar) {
        Context context = this.c;
        String str = mxcVar.b;
        mxb mxbVar = mxcVar.d;
        if (mxbVar == null) {
            mxbVar = mxb.d;
        }
        String str2 = mxbVar.b;
        return jan.b.g(ker.k(context, kki.I(str, str2))) && jan.b.g(ker.k(context, kki.H(str, str2)));
    }
}
