package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fbs  reason: default package */
/* loaded from: classes.dex */
public final class fbs implements jby {
    private final Context a;
    private final jbw b;
    private final fbr c;
    private final fbz d;
    private EditorInfo e;
    private boolean f;

    public fbs(Context context, jbw jbwVar, fbr fbrVar, fbz fbzVar) {
        this.a = context;
        this.c = fbrVar;
        this.b = jbwVar;
        this.d = fbzVar;
    }

    private final void j() {
        fby a;
        if (g() || (a = this.d.a()) == null) {
            return;
        }
        a.d();
    }

    private final void k() {
        if (g()) {
            fbz fbzVar = this.d;
            ((ltd) ((ltd) fbz.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper", "stopVoiceInput", 148, "VoiceInputManagerWrapper.java")).t("stopVoiceInput()");
            fby a = fbzVar.a();
            if (a == null) {
                return;
            }
            a.k(fff.OTHER);
        }
    }

    private static boolean l() {
        return ((Boolean) fbh.t.c()).booleanValue() && fbf.b;
    }

    private static boolean m(int i) {
        return i == -10042;
    }

    private static boolean n(int i, iax iaxVar) {
        return i == -10043 || i == -10055 || i == -10050 || i == -10052 || i == 67 || i == 59 || i == 55 || i == 56 || i == 62 || i == 66 || iaxVar == iax.DECODE || iaxVar == iax.COMMIT;
    }

    @Override // defpackage.jby
    public final void a(EditorInfo editorInfo, boolean z) {
        ScheduledFuture scheduledFuture;
        this.e = editorInfo;
        this.f = z;
        fbz fbzVar = this.d;
        ((ltd) ((ltd) fbz.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper", "cancelShutdown", 55, "VoiceInputManagerWrapper.java")).t("cancelShutdown()");
        synchronized (fbzVar.f) {
            scheduledFuture = (ScheduledFuture) fbzVar.e.getAndSet(null);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        fbz fbzVar2 = this.d;
        jbw jbwVar = this.b;
        ((ltd) ((ltd) fbz.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper", "syncLanguagePacks", 67, "VoiceInputManagerWrapper.java")).t("syncLanguagePacks()");
        fby a = fbzVar2.a();
        if (a == null) {
            a = fbz.c(fbzVar2.b, jbwVar);
            fbzVar2.b(a);
        }
        a.g.a.execute(new emq(a.b.a(), 20));
    }

    @Override // defpackage.jby
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.jby
    public final void c() {
        this.e = null;
        this.f = false;
        fbz fbzVar = this.d;
        ((ltd) ((ltd) fbz.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper", "shutdown", 77, "VoiceInputManagerWrapper.java")).t("shutdown()");
        fby a = fbzVar.a();
        if (a != null) {
            if (a.m()) {
                a.k(fff.OTHER);
            }
            ScheduledFuture<?> schedule = fbzVar.d.schedule(new fal(fbzVar, 15), 20L, TimeUnit.SECONDS);
            synchronized (fbzVar.f) {
                fbzVar.e.set(schedule);
            }
        }
    }

    @Override // defpackage.jby
    public final void d(ibz ibzVar) {
        if (ibzVar == ibz.a || !l()) {
            return;
        }
        j();
    }

    @Override // defpackage.jby
    public final void e(jbx jbxVar) {
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x026c, code lost:
        if (defpackage.fay.g(r4.e, ((java.lang.Long) defpackage.fbh.x.c()).longValue()) != false) goto L95;
     */
    @Override // defpackage.jby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.hfd r10) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbs.f(hfd):boolean");
    }

    @Override // defpackage.jby
    public final boolean g() {
        fby a = this.d.a();
        return a != null && a.m();
    }

    @Override // defpackage.jby
    public final boolean h(int i) {
        return i == -10042 || i == -200015 || i == -10125 || i == -10066 || i == -10108;
    }

    @Override // defpackage.jby
    public final /* synthetic */ boolean i() {
        return false;
    }
}
