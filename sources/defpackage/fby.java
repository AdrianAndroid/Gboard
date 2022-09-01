package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fby  reason: default package */
/* loaded from: classes.dex */
public final class fby {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager");
    public final fbr b;
    public final Context e;
    public final fca f;
    public final fan g;
    public final jbw k;
    public final fez l;
    public final fai m;
    public final fez n;
    public final ino o;
    public List q;
    public List r;
    public fbf s;
    public ffd t;
    private final Executor u;
    private final opu v;
    public final Object j = new Object();
    public final Executor c = gyc.a;
    public final idk d = ieh.j();
    public final faf h = new faf();
    public final fcp i = new fcp();
    public final Random p = new Random();

    public fby(Context context, jbw jbwVar) {
        this.e = context;
        fbr fbrVar = new fbr(context);
        this.b = fbrVar;
        this.k = jbwVar;
        opu opuVar = new opu(this);
        this.v = opuVar;
        this.f = new fca(context, opuVar, null, null);
        this.g = new fan(context);
        mks c = gxo.c(5);
        this.l = new fez(c, new fal(this, 11), ((Long) fbh.k.c()).longValue());
        this.m = new fai(context, fbrVar);
        this.o = ino.K(context, null);
        this.u = c;
        if (n()) {
            this.n = new fez(c, new fal(this, 12), ((Long) fbh.m.c()).longValue());
        } else {
            this.n = null;
        }
    }

    public static int a(ino inoVar, long j) {
        Iterator it = c(inoVar).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() >= j) {
                i++;
            }
        }
        return i;
    }

    public static List b(ino inoVar) {
        String y = inoVar.y(R.string.f162320_resource_name_obfuscated_res_0x7f140709);
        if (TextUtils.isEmpty(y)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(5);
        for (String str : lfy.c(',').k(y)) {
            arrayList.add(few.a(str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List c(ino inoVar) {
        long j;
        String y = inoVar.y(R.string.f162780_resource_name_obfuscated_res_0x7f140738);
        if (y == null || y.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(5);
        for (String str : lfy.c(',').k(y)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "getVoiceUseTimes", 278, "VoiceInputManager.java")).z("getVoiceUseTimes() : Invalid timestamp in pref %s : '%s'", R.string.f162780_resource_name_obfuscated_res_0x7f140738, y);
                j = 0;
            }
            if (j != 0) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    public static boolean l(Context context, ino inoVar) {
        float floatValue;
        float m = inoVar.m(R.string.f160640_resource_name_obfuscated_res_0x7f140660, -1.0f);
        hrx.y(context);
        hqt b = hqp.b();
        if (b == null) {
            floatValue = 0.0f;
        } else {
            jav i = b.i();
            if (o(fbh.A).contains(i)) {
                floatValue = ((Double) fbh.B.c()).floatValue();
            } else if (o(fbh.C).contains(i)) {
                floatValue = ((Double) fbh.D.c()).floatValue();
            } else if (o(fbh.E).contains(i)) {
                floatValue = ((Double) fbh.F.c()).floatValue();
            } else {
                floatValue = ((Double) fbh.G.c()).floatValue();
            }
        }
        return m != -1.0f && m < floatValue;
    }

    public static boolean n() {
        return ((Boolean) fbh.l.c()).booleanValue();
    }

    private static ArrayList o(hhl hhlVar) {
        ArrayList arrayList = new ArrayList();
        for (String str : lfy.c(',').h().b().i((String) hhlVar.c())) {
            arrayList.add(jav.f(str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        fbf fbfVar = this.s;
        if (fbfVar != null) {
            fbfVar.b();
            this.s = null;
        }
    }

    final void e() {
        if (this.i.f()) {
            this.i.c(false);
            fca fcaVar = this.f;
            fcaVar.b.execute(new fal(fcaVar, 18));
        }
    }

    public final void f(final ffd ffdVar) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "resumeRecognition", 325, "VoiceInputManager.java")).w("resumeRecognition() : %s", this.i);
        if (!this.i.f()) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "resumeRecognition", 327, "VoiceInputManager.java")).t("resumeRecognition() : Cannot start when UI is closed");
            k(fff.OTHER);
            return;
        }
        synchronized (this.j) {
            this.b.k(true);
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "startRecognizer", 580, "VoiceInputManager.java")).w("startRecognizer() : %s", this.i);
            if (!this.i.e() && !this.i.d()) {
                gqc b = fbr.b();
                if (b != null && ffdVar.f && b.m()) {
                    b.r();
                    kki.i(new elr(this, ffdVar, 16), ((Long) fbh.y.c()).longValue());
                } else {
                    g(ffdVar);
                }
            }
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "startRecognizer", 583, "VoiceInputManager.java")).w("startRecognizer() : Cannot run with %s", this.i);
        }
        kcu.U(kcu.N(new Runnable() { // from class: fbw
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0220  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x02cd  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x037d  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x03ab  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x03ae  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x02d1  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1112
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fbw.run():void");
            }
        }, this.u), new eay(ffdVar, 12), this.u);
    }

    public final void g(ffd ffdVar) {
        this.i.a(true);
        this.i.b(true);
        faf fafVar = this.h;
        fafVar.d = SystemClock.elapsedRealtime();
        fafVar.a.set(0);
        fan fanVar = this.g;
        fcp fcpVar = this.i;
        fbx fbxVar = new fbx(this);
        fanVar.g = ffdVar;
        fanVar.h = new fam(fanVar, ffdVar, fcpVar, fbxVar);
        fao faoVar = fanVar.c;
        fex fexVar = null;
        if (fao.l(faoVar.g, ffdVar)) {
            fex a2 = faoVar.a(fao.e, ffdVar);
            if (a2 != null) {
                ((luc) ((luc) fao.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "getAiAiSpeechRecognizer", 118, "SpeechRecognitionFactory.java")).t("Using the AiAi speech recognizer.");
                faoVar.h = new WeakReference(a2);
                fexVar = a2;
            } else {
                ((luc) ((luc) fao.a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "getAiAiSpeechRecognizer", 122, "SpeechRecognitionFactory.java")).t("Failed to initialize the AiAi speech recognizer. Falling back!!");
            }
        }
        if (fexVar != null) {
            fanVar.f = fexVar;
            fexVar.e(ffdVar, fcpVar, fanVar.h, fanVar.b.aj(R.string.f160410_resource_name_obfuscated_res_0x7f140646));
            fanVar.e = true;
            return;
        }
        fanVar.a.execute(new epv(fanVar, ffdVar, fcpVar, 6));
    }

    public final void h(fff fffVar) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "stopListeningVoice", 421, "VoiceInputManager.java")).G("stopListeningVoice(%s) : %s", fffVar, this.i);
        synchronized (this.j) {
            if (this.i.d() || this.i.f()) {
                this.f.a();
                e();
                i(fffVar);
                this.l.c();
                this.c.execute(new fal(this, 10));
                return;
            }
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "stopListeningVoice", 424, "VoiceInputManager.java")).t("Cannot stop when UI is closed or Mic is not listening");
        }
    }

    public final void i(fff fffVar) {
        if (this.i.d()) {
            this.i.a(false);
            fan fanVar = this.g;
            if (fanVar.f == null || fanVar.f.a() != few.AIAI) {
                fanVar.a.execute(new elr(fanVar, fffVar, 13));
            } else {
                fanVar.f.c(fffVar);
            }
        }
    }

    public final void j() {
        if (this.i.e()) {
            this.i.b(false);
            fan fanVar = this.g;
            if (fanVar.f == null || fanVar.f.a() != few.AIAI) {
                fanVar.a.execute(new fal(fanVar, 1));
                return;
            }
            fanVar.f.d();
            fanVar.f.b();
        }
    }

    public final void k(fff fffVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager", "stopVoiceInput", 441, "VoiceInputManager.java")).w("stopVoiceInput() : %s", this.i);
        synchronized (this.j) {
            if (!m()) {
                d();
                return;
            }
            this.f.a();
            e();
            i(fffVar);
            j();
            this.l.c();
            if (n()) {
                this.n.c();
            }
            this.b.k(false);
            this.c.execute(new fal(this, 8));
            fbf fbfVar = this.s;
            if (fbfVar != null && fbfVar.f) {
                fbfVar.e = System.currentTimeMillis();
                fbfVar.j.g(gyc.b);
            }
            this.d.e(fbm.VOICE_INPUT_STOP, new Object[0]);
            fcb.a().b(fbm.INPUT_CHAR_WHEN_STOPPING_VOICE_IME);
        }
    }

    public final boolean m() {
        return this.i.g();
    }
}
