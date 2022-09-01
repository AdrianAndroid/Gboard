package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fbr  reason: default package */
/* loaded from: classes.dex */
public final class fbr {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils");
    public static final iay b = new iay(-10042, null, "");
    public static final iay c = new iay(-10066, null, "");
    public final Context d;
    public final ino e;
    public final Executor f;
    private final ino g;
    private final faj h;
    private final iqe i;

    public fbr(Context context) {
        ino M = ino.M(context);
        ino K = ino.K(context, null);
        faj fajVar = new faj();
        gyc gycVar = gyc.a;
        this.d = context;
        this.g = M;
        this.e = K;
        this.h = fajVar;
        this.f = gycVar;
        this.i = iqe.g(context.getString(R.string.f159080_resource_name_obfuscated_res_0x7f14059f));
    }

    public static gqc b() {
        hsk b2 = hsx.b();
        if (b2 == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "getAccessibilityHelper", 433, "VoiceImeUtils.java")).t("Service is null and could not be get AccessibilityHelper.");
            return null;
        }
        return b2.O();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view) {
        hxk.a(view.getContext()).b(view, 0);
    }

    public static void h() {
        i("");
    }

    public static void i(String str) {
        hsk b2 = hsx.b();
        if (b2 == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "sendLaunchVoiceEventToInputBundle", 385, "VoiceImeUtils.java")).t("Service is null and could not be acquired.");
        } else {
            b2.at(hfd.d(new iay(-10042, null, str)));
        }
    }

    public static boolean m(Context context) {
        return irs.d() || ijw.c(context, "android.permission.RECORD_AUDIO");
    }

    public final ffd a() {
        return r(hsu.b(), false, false);
    }

    public final void d() {
        Context context = this.d;
        ino K = ino.K(context, null);
        if (K.al("ondevice_banner", false, false)) {
            return;
        }
        hky a2 = hlf.a();
        a2.p("ondevice_banner");
        a2.m = 2;
        a2.s(R.layout.f143960_resource_name_obfuscated_res_0x7f0e04ac);
        a2.m(0L);
        a2.k(true);
        a2.g(context.getString(R.string.f159250_resource_name_obfuscated_res_0x7f1405b5));
        a2.a = fcc.a;
        a2.l(R.animator.f500_resource_name_obfuscated_res_0x7f020011);
        a2.e = fcd.a;
        a2.h(R.animator.f490_resource_name_obfuscated_res_0x7f020010);
        a2.f = fcd.a;
        a2.j = new fci(K, 1);
        hkq.b(a2.a());
    }

    public final void e() {
        if (o()) {
            l(false);
        }
        lre.a = p();
    }

    public final void g(final fai faiVar, iay iayVar) {
        if (faiVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "requestPermissions", 324, "VoiceImeUtils.java")).t("RecordAudioPermissionsChecker is null. Cannot request voice permission.");
            j();
        } else if (!((Boolean) fbh.g.c()).booleanValue() || !this.e.ai("mic_permission_status") || p()) {
            faiVar.b(iayVar);
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "requestPermissions", 332, "VoiceImeUtils.java")).t("Permission was denied. Show voice permission promo.");
            Context context = this.d;
            hsk b2 = hsx.b();
            if (b2 == null) {
                ((ltd) ((ltd) fcj.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay", "showVoicePermissionPromo", 41, "VoicePermissionKeyboardOverlay.java")).t("No service. Cannot show voice permission promo.");
                return;
            }
            final View a2 = fcj.a(b2, ice.HEADER);
            if (a2 == null) {
                ((ltd) ((ltd) fcj.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay", "showVoicePermissionPromo", 46, "VoicePermissionKeyboardOverlay.java")).t("keyboardHeader is null. Cannot show voice permission promo.");
                return;
            }
            final View a3 = fcj.a(b2, ice.BODY);
            if (a3 == null) {
                ((ltd) ((ltd) fcj.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoicePermissionKeyboardOverlay", "showVoicePermissionPromo", 51, "VoicePermissionKeyboardOverlay.java")).t("keyboardBody is null. Cannot show voice permission promo.");
                return;
            }
            final View g = hyq.g(b2.G(), b2.y());
            hky a4 = hlf.a();
            a4.p("permission_promo_overlay");
            a4.m = 1;
            a4.s(R.layout.f143980_resource_name_obfuscated_res_0x7f0e04ae);
            a4.o(true);
            a4.m(0L);
            a4.k(true);
            a4.i(true);
            a4.g(context.getString(R.string.f188120_resource_name_obfuscated_res_0x7f1411a4));
            a4.a = new hle() { // from class: fch
                @Override // defpackage.hle
                public final void a(final View view) {
                    final View view2 = a2;
                    final View view3 = a3;
                    fai faiVar2 = faiVar;
                    View view4 = g;
                    fcj.c(view, view2, view3);
                    view.findViewById(R.id.f130810_resource_name_obfuscated_res_0x7f0b220d).setOnClickListener(new fat(faiVar2, 6));
                    view.findViewById(R.id.f130800_resource_name_obfuscated_res_0x7f0b220c).setOnClickListener(bwk.i);
                    view.findViewById(R.id.f130780_resource_name_obfuscated_res_0x7f0b220a).setOnClickListener(bwk.j);
                    if (view4 != null) {
                        view.setOutlineProvider(view4.getOutlineProvider());
                        view.setClipToOutline(view4.getClipToOutline());
                    }
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: fcg
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            View view6 = view;
                            View view7 = view2;
                            View view8 = view3;
                            if (view5 == view6) {
                                fcj.c(view6, view7, view8);
                            }
                        }
                    });
                }
            };
            a4.c = a2;
            a4.d = bwe.g;
            a4.j = bsd.j;
            gyc.b.execute(new fci(a4.a(), 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        ker.p(this.d, R.string.f176670_resource_name_obfuscated_res_0x7f140cee, new Object[0]);
    }

    public final void k(boolean z) {
        this.f.execute(new fbq(z, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z) {
        this.e.f("mic_permission_permanently_denied", z);
    }

    public final boolean n() {
        EditorInfo b2 = hsu.b();
        if (b2 == null) {
            return false;
        }
        String m = ham.m(b2);
        if (TextUtils.isEmpty(m)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "isAppPackageNameAllowed", 407, "VoiceImeUtils.java")).t("Empty app package name. voice notice will not show.");
            return false;
        }
        return this.i.j(m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return ijw.c(this.d, "android.permission.RECORD_AUDIO");
    }

    final boolean p() {
        int i = ffg.a;
        return this.e.ak("mic_permission_permanently_denied");
    }

    public final boolean q() {
        EditorInfo b2 = hsu.b();
        return !lre.aH(this.d, b2, hsu.f()) && !lre.aG(this.d, b2) && !lre.aI(this.d, b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ffd r(android.view.inputmethod.EditorInfo r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            android.content.Context r0 = r6.d
            defpackage.hrx.y(r0)
            hqt r0 = defpackage.hqp.b()
            if (r0 != 0) goto Le
            lrr r1 = defpackage.lrr.a
            goto L12
        Le:
            lmz r1 = r0.k()
        L12:
            r2 = 0
            if (r0 != 0) goto L17
        L15:
            r0 = r2
            goto L43
        L17:
            jav r0 = r0.i()
            faj r3 = r6.h
            boolean r3 = r3.b(r0)
            if (r3 != 0) goto L43
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2a
            goto L15
        L2a:
            lsz r0 = r1.iterator()
        L2e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r0.next()
            jav r3 = (defpackage.jav) r3
            faj r4 = r6.h
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L2e
            r0 = r3
        L43:
            if (r0 != 0) goto L46
            goto L87
        L46:
            faj r3 = r6.h
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L4f
            goto L87
        L4f:
            if (r1 == 0) goto L87
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L58
            goto L87
        L58:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            jav r4 = (defpackage.jav) r4
            boolean r5 = r4.equals(r0)
            if (r5 != 0) goto L61
            faj r5 = r6.h
            boolean r5 = r5.c(r4)
            if (r5 == 0) goto L61
            r3.add(r4)
            goto L61
        L7f:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L86
            goto L87
        L86:
            r2 = r3
        L87:
            ffc r1 = new ffc
            r1.<init>()
            r3 = 0
            r1.c(r3)
            r1.b(r3)
            r1.e(r3)
            byte r4 = r1.e
            r4 = r4 | 8
            byte r4 = (byte) r4
            r1.e = r4
            r1.d(r3)
            r1.a = r0
            r1.b = r2
            ino r0 = r6.g
            r2 = 2132018757(0x7f140645, float:1.967583E38)
            boolean r0 = r0.aj(r2)
            r1.c(r0)
            r1.b(r8)
            r1.d(r9)
            if (r7 == 0) goto Lc0
            java.lang.String r8 = r7.packageName
            r1.c = r8
            java.lang.String r7 = r7.fieldName
            r1.d = r7
        Lc0:
            ffd r7 = r1.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbr.r(android.view.inputmethod.EditorInfo, boolean, boolean):ffd");
    }

    public final void s(EditorInfo editorInfo, boolean z) {
        int i;
        int i2;
        if (!hjg.r()) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "showDisabledMicToast", 465, "VoiceImeUtils.java")).t("Toast for disabled mic should be called from UI thread.");
            return;
        }
        if (ham.G(editorInfo)) {
            i = R.string.f150360_resource_name_obfuscated_res_0x7f140195;
            i2 = 1;
        } else if (z) {
            i = R.string.f150370_resource_name_obfuscated_res_0x7f140196;
            i2 = 2;
        } else {
            i = -1;
            i2 = -1;
        }
        if (i == -1) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeUtils", "showDisabledMicToast", 483, "VoiceImeUtils.java")).t("Disabled Mic toast res ID should be available.");
            return;
        }
        ker.n(this.d, i, new Object[0]);
        ieh.j().e(fbm.DISABLED_MIC_TOAST, Integer.valueOf(i2));
    }

    public static void c(boolean z, boolean z2) {
        if (z) {
            if (!z2) {
                ijl.b().g(new jce(2));
            } else {
                ijl.b().g(new jce(1));
            }
        }
    }
}
