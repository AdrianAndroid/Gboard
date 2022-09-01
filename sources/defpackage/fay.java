package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.io.File;

/* compiled from: PG */
/* renamed from: fay  reason: default package */
/* loaded from: classes.dex */
public final class fay {
    public static int a(Context context) {
        return ino.K(context, null).b("voice_donation_promo_shown_times", 0);
    }

    public static void b(Context context, boolean z) {
        ino.K(context, null).q(R.string.f162760_resource_name_obfuscated_res_0x7f140736, z);
    }

    public static void c(Context context, boolean z) {
        ino.K(context, null).q(R.string.f162750_resource_name_obfuscated_res_0x7f140735, z);
    }

    public static void d(Context context, int i) {
        ino.K(context, null).h("voice_donation_promo_shown_times", i);
    }

    public static void e(Context context, boolean z) {
        ino.K(context, null).f("voice_donation_renewal_banner", z);
    }

    public static void f(Context context, boolean z) {
        ino.M(context).q(R.string.f161100_resource_name_obfuscated_res_0x7f14068e, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(Context context, long j) {
        long c = ino.M(context).c("voice_donation_opt_in_timestamp", 0L);
        return c > 0 && c < System.currentTimeMillis() - j;
    }

    public static boolean h(Context context) {
        return ino.K(context, null).x(R.string.f162750_resource_name_obfuscated_res_0x7f140735, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Context context) {
        return ino.M(context).x(R.string.f161100_resource_name_obfuscated_res_0x7f14068e, false);
    }

    public static /* synthetic */ void j(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception unused) {
        }
    }

    public static nnf k(Context context) {
        nfh t = nnf.g.t();
        String m = m(context);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnf nnfVar = (nnf) t.b;
        m.getClass();
        nnfVar.a |= 1;
        nnfVar.b = m;
        nnf nnfVar2 = (nnf) t.b;
        nnfVar2.f = 1;
        int i = nnfVar2.a | 128;
        nnfVar2.a = i;
        nnfVar2.a = i | 2;
        nnfVar2.c = true;
        nnz l = l();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnf nnfVar3 = (nnf) t.b;
        l.getClass();
        nnfVar3.d = l;
        nnfVar3.a |= 8;
        nfh t2 = nng.e.t();
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nng nngVar = (nng) t2.b;
        absolutePath.getClass();
        nngVar.a = 1 | nngVar.a;
        nngVar.b = absolutePath;
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nng nngVar2 = (nng) t2.b;
        absolutePath2.getClass();
        nngVar2.a |= 4;
        nngVar2.c = absolutePath2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnf nnfVar4 = (nnf) t.b;
        nng nngVar3 = (nng) t2.cz();
        nngVar3.getClass();
        nnfVar4.e = nngVar3;
        nnfVar4.a |= 32;
        return (nnf) t.cz();
    }

    public static nnz l() {
        nfh t = nnz.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnz nnzVar = (nnz) t.b;
        int i = nnzVar.a | 4;
        nnzVar.a = i;
        nnzVar.e = 24;
        nnzVar.a = i | 2;
        nnzVar.d = 1512;
        nfh t2 = nnk.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nnk nnkVar = (nnk) t2.b;
        int i2 = nnkVar.a | 1;
        nnkVar.a = i2;
        nnkVar.b = "Gboard";
        nnkVar.a = i2 | 4;
        nnkVar.c = "http://ariane/4000159";
        nfh t3 = nns.d.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        nns nnsVar = (nns) t3.b;
        nnsVar.a |= 1;
        nnsVar.b = true;
        nfh t4 = nnr.c.t();
        nni nniVar = nni.GBOARD_SESSION;
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        nnr nnrVar = (nnr) t4.b;
        nnrVar.b = nniVar.aq;
        nnrVar.a |= 1;
        nnr.c(nnrVar);
        t3.eh(t4);
        nfh t5 = nnr.c.t();
        nni nniVar2 = nni.GBOARD_VOICE_INPUT_CONTEXT;
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        nnr nnrVar2 = (nnr) t5.b;
        nnrVar2.b = nniVar2.aq;
        nnrVar2.a |= 1;
        nnr.c(nnrVar2);
        t3.eh(t5);
        nfh t6 = nnr.c.t();
        nni nniVar3 = nni.GBOARD_VOICE_RECORDING;
        if (t6.c) {
            t6.cD();
            t6.c = false;
        }
        nnr nnrVar3 = (nnr) t6.b;
        nnrVar3.b = nniVar3.aq;
        nnrVar3.a |= 1;
        nnr.c(nnrVar3);
        t3.eh(t6);
        nfh t7 = nnr.c.t();
        nni nniVar4 = nni.GBOARD_KEYBOARD_SESSION;
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        nnr nnrVar4 = (nnr) t7.b;
        nnrVar4.b = nniVar4.aq;
        nnrVar4.a |= 1;
        nnr.c(nnrVar4);
        t3.eh(t7);
        nfh t8 = nnr.c.t();
        nni nniVar5 = nni.GBOARD_INPUT_TURN;
        if (t8.c) {
            t8.cD();
            t8.c = false;
        }
        nnr nnrVar5 = (nnr) t8.b;
        nnrVar5.b = nniVar5.aq;
        nnrVar5.a |= 1;
        nnr.c(nnrVar5);
        t3.eh(t8);
        nfh t9 = nnr.c.t();
        nni nniVar6 = nni.SPEECH_LEARNING_SCHEDULING_RESULT;
        if (t9.c) {
            t9.cD();
            t9.c = false;
        }
        nnr nnrVar6 = (nnr) t9.b;
        nnrVar6.b = nniVar6.aq;
        nnrVar6.a |= 1;
        nnr.c(nnrVar6);
        t3.eh(t9);
        nfh t10 = nnr.c.t();
        nni nniVar7 = nni.SPEECH_LEARNING_TASK_RESULT;
        if (t10.c) {
            t10.cD();
            t10.c = false;
        }
        nnr nnrVar7 = (nnr) t10.b;
        nnrVar7.b = nniVar7.aq;
        nnrVar7.a |= 1;
        nnr.c(nnrVar7);
        t3.eh(t10);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        nnk nnkVar2 = (nnk) t2.b;
        nns nnsVar2 = (nns) t3.cz();
        nnsVar2.getClass();
        nnkVar2.d = nnsVar2;
        nnkVar2.a |= 8;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnz nnzVar2 = (nnz) t.b;
        nnk nnkVar3 = (nnk) t2.cz();
        nnkVar3.getClass();
        nga ngaVar = nnzVar2.c;
        if (!ngaVar.c()) {
            nnzVar2.c = nfm.H(ngaVar);
        }
        nnzVar2.c.add(nnkVar3);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nnz nnzVar3 = (nnz) t.b;
        nnzVar3.a |= 1;
        nnzVar3.b = 459249334;
        return (nnz) t.cz();
    }

    public static String m(Context context) {
        return new File(context.getNoBackupFilesDir(), "training_cache").getAbsolutePath();
    }
}
