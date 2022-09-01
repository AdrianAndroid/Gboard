package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.IBinder;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.SuggestionSpan;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import com.google.android.apps.inputmethod.libs.translate.ITranslateUIExtension;
import com.google.android.apps.inputmethod.libs.translate.SuggestionSpanBroadcastForwarder;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import com.google.android.apps.inputmethod.libs.translate.TranslateKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ezx  reason: default package */
/* loaded from: classes.dex */
public final class ezx extends dbk implements ITranslateUIExtension, TextWatcher, View.OnTouchListener, eyx {
    public static long k;
    private Runnable B;
    private eyr C;
    private eyr D;
    private eyl E;
    private String F;
    private boolean G;
    private boolean H;
    private gqk J;
    private boolean K;
    public int l;
    public eyn m;
    public ezn n;
    public ezc o;
    public eyt q;
    public eyt r;
    public boolean t;
    public boolean u;
    public ezb v;
    public String w;
    public String x;
    public boolean y;
    public static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension");
    private static final hhl z = hhq.a("offline_translate", false);
    public static final UnderlineSpan j = new UnderlineSpan();
    private long A = 0;
    public final ezd p = new ezd();
    public CharSequence s = "";
    private int I = 0;
    private final gwv L = new gwv((byte[]) null);

    private final IBinder ag() {
        IBinder F = ((hfw) z()).d.F();
        if (F != null) {
            return F;
        }
        throw new IllegalStateException("WindowToken is required for opening dialog from OpenableExtension.");
    }

    private static String ah(Map map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final void ai(boolean z2) {
        eyn eynVar;
        ezn eznVar = this.n;
        if ((eznVar.b.l() || eznVar.c.l() || z2) && (eynVar = this.m) != null) {
            eynVar.a(this.n.a(), this.E);
        }
    }

    private final void ak() {
        if (TextUtils.isEmpty(((dbk) this).a)) {
            this.l = 1;
            String str = (String) ((hfw) z()).d.bL();
            if (!TextUtils.isEmpty(str)) {
                this.g.e(ezo.OPEN, 2);
                ((dbk) this).a = str;
                hsy hsyVar = this.e;
                if (hsyVar != null) {
                    hsyVar.B(str);
                }
                this.l = 2;
                return;
            }
            this.g.e(ezo.OPEN, 1);
        }
    }

    private final void al(int i2) {
        gqk gqkVar = this.J;
        if (gqkVar != null) {
            gqkVar.a(i2);
        }
    }

    private final void am() {
        ezb ezbVar;
        eyn eynVar = this.m;
        if (eynVar == null || (ezbVar = this.v) == null) {
            return;
        }
        ezn eznVar = this.n;
        boolean f = eynVar.f(eznVar.b.d, eznVar.c.d);
        if (ezbVar.j == f) {
            return;
        }
        ezbVar.j = f;
        ezbVar.d(ezbVar.b());
    }

    private static boolean an(int i2) {
        return i2 == 1 || i2 == 2;
    }

    private static boolean ao(int i2) {
        return i2 == 4 || i2 == 0;
    }

    private static boolean ap(EditorInfo editorInfo) {
        if (!((Boolean) ezg.d.c()).booleanValue()) {
            if (editorInfo == null) {
                return true;
            }
            if (!ham.at(editorInfo)) {
                return false;
            }
            int e = ham.e(editorInfo);
            return e == 0 || e == 48 || e == 80 || e == 64 || e == 160;
        }
        return false;
    }

    @Override // defpackage.dbn
    protected final String E() {
        return this.c.getString(R.string.f154000_resource_name_obfuscated_res_0x7f140335);
    }

    @Override // defpackage.dbn
    public final synchronized void G() {
        u(1);
        this.l = 0;
        super.G();
    }

    @Override // defpackage.dbn
    protected final void L() {
        al(0);
        J();
    }

    @Override // defpackage.dbn
    protected final void M() {
        super.M();
        if (!((Boolean) iho.a(this.c).c()).booleanValue()) {
            al(1);
            Q();
        }
    }

    @Override // defpackage.dbn, defpackage.hfz
    public final boolean T(boolean z2) {
        if (!z2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - k < 1000) {
                this.G = true;
                return true;
            }
            ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "shouldRestore", 745, "TranslateUIExtension.java")).v("Last seen dialog dismiss time in (%d) ms", currentTimeMillis - k);
            if (currentTimeMillis - this.A >= 1000 || !ham.ae(z().f())) {
                return false;
            }
            this.G = true;
            return true;
        }
        return true;
    }

    @Override // defpackage.dbn, defpackage.hfz
    public final void W(int i2, int i3, int i4, int i5) {
        this.t = i3 >= i4 && i2 <= i5;
        TranslateKeyboard f = f();
        if (f != null && an(this.l)) {
            if (!(i2 == 0 && i3 == 0) && !li.e()) {
                return;
            }
            ExtractedText bK = ((hfw) z()).d.bK();
            if (bK != null && !TextUtils.isEmpty(bK.text)) {
                return;
            }
            if (this.H) {
                this.H = false;
                return;
            }
            f.m();
            Y();
        }
    }

    public final void Y() {
        if (!R()) {
            return;
        }
        TranslateKeyboard f = f();
        if (f == null || !af() || ao(this.l)) {
            z().R(null, false);
        } else {
            z().R(f.t(z().f()), false);
        }
    }

    public final void Z(String str) {
        TranslateKeyboard f = f();
        if (f == null || str == null || !this.n.f()) {
            return;
        }
        ezl ezlVar = this.n.b;
        if (ezn.e(ezlVar.d)) {
            ezlVar.h = str;
        } else {
            ((ltd) ((ltd) ezn.a.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage$SourceLanguage", "updateDetectedLanguage", 542, "TranslateLanguage.java")).t("Update detected language when source is not 'auto'");
        }
        f.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
        if (r10.equals(defpackage.ezz.a(r4)) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aa(boolean r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezx.aa(boolean):void");
    }

    public final void ab(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.n.b.d;
        if (str2.equals(str)) {
            return;
        }
        boolean f = this.n.f();
        if (!z2 && f) {
            return;
        }
        this.n.b.f(str);
        if (this.n.d() || f || this.n.c.f(str2)) {
            return;
        }
        ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "setSource", 562, "TranslateUIExtension.java")).w("Failed to set last source(%s) as target language", str2);
    }

    public final void ac(final String str) {
        if (this.l != 2 || this.m == null || TextUtils.isEmpty(str)) {
            return;
        }
        final String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            this.p.a();
            this.s = str;
            z().M(this.s);
        } else if (str.length() > 200) {
            ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "translateAsync", 1000, "TranslateUIExtension.java")).u("Query ignored, length exceeds %d.", str.length());
        } else if (af()) {
            final long currentTimeMillis = System.currentTimeMillis();
            eyn eynVar = this.m;
            if (eynVar == null) {
                return;
            }
            ezp a = ezq.a();
            a.b(this.n.b.d);
            a.c(this.n.c.d);
            a.a = trim;
            a.d = true;
            eynVar.d(a.a(), new eym() { // from class: ezu
                @Override // defpackage.eym
                public final void a(ezr ezrVar) {
                    CharSequence charSequence;
                    ezb ezbVar;
                    ezx ezxVar = ezx.this;
                    long j2 = currentTimeMillis;
                    String str2 = str;
                    String str3 = trim;
                    int i2 = ezrVar.a;
                    if (i2 != 2) {
                        if (!ezrVar.e && (ezbVar = ezxVar.v) != null) {
                            boolean z2 = true;
                            if (i2 == 1) {
                                z2 = false;
                            }
                            ezbVar.e(z2);
                        }
                        if (ezxVar.p.a > j2 || TextUtils.isEmpty(str2)) {
                            return;
                        }
                        ezd ezdVar = ezxVar.p;
                        if (ezdVar.a < j2) {
                            ezdVar.a = j2;
                        }
                        if (ezrVar == null || TextUtils.isEmpty(ezrVar.b)) {
                            ezxVar.s = str2;
                        } else {
                            int indexOf = str2.indexOf(str3);
                            int length = str3.length() + indexOf;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            String str4 = "";
                            spannableStringBuilder.append((CharSequence) (indexOf > 0 ? str2.substring(0, indexOf) : str4));
                            if (!ezxVar.u) {
                                charSequence = ezrVar.b;
                            } else {
                                String str5 = ezrVar.b;
                                List<String> list = ezrVar.c;
                                Context context = ezxVar.c;
                                Locale locale = Locale.getDefault();
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                if (!TextUtils.isEmpty(str5)) {
                                    linkedHashSet.add(str5);
                                }
                                if (!list.isEmpty()) {
                                    for (String str6 : list) {
                                        if (linkedHashSet.size() >= 4) {
                                            break;
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            linkedHashSet.add(str6);
                                        }
                                    }
                                }
                                linkedHashSet.add(str3);
                                SuggestionSpan suggestionSpan = new SuggestionSpan(context, locale, (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]), 1, SuggestionSpanBroadcastForwarder.class);
                                ezxVar.o.b = suggestionSpan;
                                String str7 = ezrVar.b;
                                SpannableString spannableString = new SpannableString(str7);
                                spannableString.setSpan(suggestionSpan, 0, str7.length(), 33);
                                spannableString.setSpan(new BackgroundColorSpan(Color.parseColor("#807BAAF7")), 0, str7.length(), 33);
                                charSequence = spannableString;
                            }
                            LocaleSpan localeSpan = new LocaleSpan(new Locale(ezxVar.n.c.d));
                            SpannableString valueOf = SpannableString.valueOf(charSequence);
                            valueOf.setSpan(localeSpan, 0, valueOf.length(), 17);
                            spannableStringBuilder.append((CharSequence) new SpannableString(valueOf));
                            if (length < str2.length()) {
                                str4 = str2.substring(length);
                            }
                            spannableStringBuilder.append((CharSequence) str4);
                            spannableStringBuilder.setSpan(ezx.j, 0, spannableStringBuilder.length(), 273);
                            ezxVar.s = new SpannableString(spannableStringBuilder);
                        }
                        ezxVar.z().M(ezxVar.s);
                        List list2 = ezrVar.d;
                        if (list2.isEmpty()) {
                            return;
                        }
                        ezxVar.Z((String) list2.get(0));
                        return;
                    }
                    ((ltd) ((ltd) ezx.i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "lambda$translateAsync$7", 1019, "TranslateUIExtension.java")).t("Bad translate request.");
                }
            });
        } else {
            ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "translateAsync", 1004, "TranslateUIExtension.java")).t("Query should not be triggered after network is off.");
        }
    }

    public final void ad(boolean z2) {
        TranslateKeyboard f = f();
        if (f == null) {
            return;
        }
        if (!z2) {
            u(1);
        }
        ezi eziVar = f.c;
        eziVar.c = z2;
        eziVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean af() {
        ezb ezbVar = this.v;
        if (ezbVar != null) {
            if (ezbVar.j) {
                return true;
            }
            if (ezbVar.d) {
                return eyh.c(ezb.a(ezbVar.b));
            }
            ((ltd) ezb.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/translate/ServerStatusMonitor", "isServiceAvailable", 182, "ServerStatusMonitor.java")).t("Network status should only be read when activated");
            return false;
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null || !an(this.l)) {
            return;
        }
        String str = ((dbk) this).a;
        ((dbk) this).a = editable.toString();
        if (TextUtils.isEmpty(((dbk) this).a)) {
            if (this.l != 2) {
                return;
            }
            this.p.a();
            z().M("");
            aj(false);
            this.H = true;
            gyc.b.execute(new emq(this, 17));
            this.l = 1;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String str2 = ((dbk) this).a;
            if (!TextUtils.isEmpty(str2)) {
                String lowerCase = jay.f(this.n.c.d).getLanguage().toLowerCase(Locale.US);
                if (!"zh".equals(lowerCase) && !"ja".equals(lowerCase) && !"ko".equals(lowerCase) && !"th".equals(lowerCase)) {
                    CharSequence ah = z().ah();
                    if (!TextUtils.isEmpty(ah) && Character.isAlphabetic(ah.toString().codePointAt(0)) && Character.isAlphabetic(str2.codePointAt(0))) {
                        aj(true);
                        z().x(" ");
                    }
                }
            }
        }
        if (this.l != 2) {
            this.l = 2;
        }
        ac(((dbk) this).a);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // defpackage.dbn, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (ao(this.l)) {
            return super.c(hfdVar);
        }
        if (hfdVar.f() != null) {
            iay f = hfdVar.f();
            int i2 = f.c;
            if (i2 == -10018) {
                if (this.e != null) {
                    u(0);
                }
            } else if (i2 == -10079) {
                Object obj = f.e;
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.equalsIgnoreCase("source")) {
                        if (!((Boolean) ezg.d.c()).booleanValue()) {
                            Context y = y();
                            IBinder ag = ag();
                            ezn eznVar = this.n;
                            this.q = new eys(y, ag, R.string.f176780_resource_name_obfuscated_res_0x7f140cf9, ezz.f(eznVar.b.f, eznVar.a()), this.n.b.d(), this.n.b.d, this.C);
                        } else {
                            Context y2 = y();
                            IBinder ag2 = ag();
                            ezn eznVar2 = this.n;
                            this.q = new eyu(y2, ag2, R.string.f176790_resource_name_obfuscated_res_0x7f140cfa, ezz.f(eznVar2.b.f, eznVar2.a()), this.n.b.d(), this.n.b.d, new ebi(this, 14), this.C);
                        }
                        this.q.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ezt
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ezx.k = System.currentTimeMillis();
                            }
                        });
                        this.q.show();
                    } else if (str.equalsIgnoreCase("target")) {
                        if (!((Boolean) ezg.d.c()).booleanValue()) {
                            Context y3 = y();
                            IBinder ag3 = ag();
                            ezn eznVar3 = this.n;
                            this.r = new eys(y3, ag3, R.string.f176800_resource_name_obfuscated_res_0x7f140cfb, ezz.f(eznVar3.c.f, eznVar3.a()), this.n.c.d(), this.n.c.d, this.D);
                        } else {
                            Context y4 = y();
                            IBinder ag4 = ag();
                            ezn eznVar4 = this.n;
                            this.r = new eyu(y4, ag4, R.string.f176810_resource_name_obfuscated_res_0x7f140cfc, ezz.f(eznVar4.c.f, eznVar4.a()), this.n.c.d(), this.n.c.d, new ebi(this, 13), this.D);
                        }
                        this.r.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ezt
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                ezx.k = System.currentTimeMillis();
                            }
                        });
                        this.r.show();
                    } else if (str.equalsIgnoreCase("swap")) {
                        this.g.e(ezo.CHANGE_LANGUAGE, 2);
                        ezn eznVar5 = this.n;
                        if (eznVar5.g()) {
                            String m = eznVar5.b.m();
                            eznVar5.b.f(eznVar5.c.d);
                            eznVar5.c.f(m);
                        } else {
                            ((ltd) ((ltd) ezn.a.d()).k("com/google/android/apps/inputmethod/libs/translate/TranslateLanguage", "swapLanguage", 204, "TranslateLanguage.java")).G("Language pair is not swappable(%s, %s)", eznVar5.b.m(), eznVar5.c.d);
                        }
                        aa(true);
                    }
                }
                return true;
            } else if (i2 == -10060) {
                if (f.e == null && this.K) {
                    this.g.e(ezo.CLOSED_AFTER_AUTO_SHOW, new Object[0]);
                }
            } else if (this.e != null && iaz.i(i2)) {
                this.l = 2;
            }
        }
        return super.c(hfdVar);
    }

    @Override // defpackage.dbn
    protected final int d() {
        return R.xml.f210280_resource_name_obfuscated_res_0x7f170117;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final void e() {
        u(5);
        TranslateKeyboard f = f();
        if (f == null) {
            return;
        }
        f.m();
        Y();
    }

    public final TranslateKeyboard f() {
        hsy hsyVar = this.e;
        if (hsyVar instanceof TranslateKeyboard) {
            return (TranslateKeyboard) hsyVar;
        }
        return null;
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final synchronized void gm(Context context, igg iggVar) {
        super.gm(context, iggVar);
        this.g = ieh.j();
        ezn eznVar = new ezn(context);
        this.n = eznVar;
        ezl ezlVar = eznVar.b;
        ezlVar.i(R.string.f162680_resource_name_obfuscated_res_0x7f14072d, R.string.f162660_resource_name_obfuscated_res_0x7f14072b, R.string.f162640_resource_name_obfuscated_res_0x7f140729);
        if (ezlVar.e.g()) {
            hrx.y(ezlVar.a);
            llp b = hqr.b();
            if (!b.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = ((hqt) b.get(i2)).i().n;
                    if (!TextUtils.isEmpty(ezlVar.a(str))) {
                        arrayList.add(str);
                    }
                }
                if (!arrayList.isEmpty()) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ezlVar.e.f((String) arrayList.get(i3));
                    }
                    ezlVar.e.h();
                }
            }
        }
        eznVar.c.i(R.string.f162690_resource_name_obfuscated_res_0x7f14072e, R.string.f162670_resource_name_obfuscated_res_0x7f14072c, R.string.f162650_resource_name_obfuscated_res_0x7f14072a);
        Locale locale = context.getResources().getConfiguration().locale;
        ezn eznVar2 = this.n;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        eznVar2.c(locale);
        this.l = 0;
        this.t = false;
        this.o = new ezc(context);
        this.B = new emq(this, 18);
        this.C = new eyr(this) { // from class: ezv
            public final /* synthetic */ ezx a;

            {
                this.a = this;
            }

            @Override // defpackage.eyr
            public final void a(String str2) {
                boolean z2 = false;
                if (r2 == 0) {
                    ezx ezxVar = this.a;
                    if (!ezxVar.ae(true, str2)) {
                        return;
                    }
                    ezxVar.g.e(ezo.CHANGE_LANGUAGE, 0);
                    ezxVar.ab(str2, true);
                    ezxVar.q = null;
                    ezx.k = System.currentTimeMillis();
                    ezxVar.aa(true);
                    return;
                }
                ezx ezxVar2 = this.a;
                if (!ezxVar2.ae(false, str2)) {
                    return;
                }
                ezxVar2.g.e(ezo.CHANGE_LANGUAGE, 1);
                ezm ezmVar = ezxVar2.n.c;
                String str3 = ezmVar.d;
                ezmVar.f(str2);
                if (!ezxVar2.n.d() && ezxVar2.n.b.f(str3)) {
                    z2 = true;
                }
                ezxVar2.r = null;
                ezx.k = System.currentTimeMillis();
                ezxVar2.aa(z2);
            }
        };
        this.D = new eyr(this) { // from class: ezv
            public final /* synthetic */ ezx a;

            {
                this.a = this;
            }

            @Override // defpackage.eyr
            public final void a(String str2) {
                boolean z2 = false;
                if (r2 == 0) {
                    ezx ezxVar = this.a;
                    if (!ezxVar.ae(true, str2)) {
                        return;
                    }
                    ezxVar.g.e(ezo.CHANGE_LANGUAGE, 0);
                    ezxVar.ab(str2, true);
                    ezxVar.q = null;
                    ezx.k = System.currentTimeMillis();
                    ezxVar.aa(true);
                    return;
                }
                ezx ezxVar2 = this.a;
                if (!ezxVar2.ae(false, str2)) {
                    return;
                }
                ezxVar2.g.e(ezo.CHANGE_LANGUAGE, 1);
                ezm ezmVar = ezxVar2.n.c;
                String str3 = ezmVar.d;
                ezmVar.f(str2);
                if (!ezxVar2.n.d() && ezxVar2.n.b.f(str3)) {
                    z2 = true;
                }
                ezxVar2.r = null;
                ezx.k = System.currentTimeMillis();
                ezxVar2.aa(z2);
            }
        };
        this.E = new ezw(this);
        gqh gqhVar = this.d.c;
        if (gqhVar != null) {
            String str2 = gqhVar.a;
            gqe a = gqh.a();
            a.a.clear();
            llp llpVar = gqhVar.f;
            if (llpVar != null) {
                int size3 = llpVar.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ial ialVar = (ial) llpVar.get(i4);
                    a.a.put(ialVar.c, ialVar);
                }
            }
            a.b.clear();
            llw llwVar = gqhVar.i;
            if (llwVar != null) {
                a.b.putAll(llwVar);
            }
            a.i(gqhVar.a);
            a.f(gqhVar.b);
            a.g(gqhVar.c);
            a.d(gqhVar.d);
            a.e(gqhVar.e);
            a.c = gqhVar.f;
            a.d = gqhVar.g;
            a.e = gqhVar.h;
            a.g = gqhVar.j;
            a.f = gqhVar.i;
            a.l(new emq(this, 16));
            a.b("closeAction", true);
            a.b("highlighted", true);
            this.J = new gqk(0, str2, gqhVar, a.a());
        }
    }

    @Override // defpackage.dbn, defpackage.ifw
    public final void gn() {
        this.m = null;
        this.v = null;
        this.n.b();
        super.gn();
    }

    @Override // defpackage.dbn
    protected final boolean hv() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk
    public final CharSequence l() {
        Context y = y();
        return y != null ? y.getText(R.string.f176830_resource_name_obfuscated_res_0x7f140cfe) : "";
    }

    @Override // defpackage.dbk, defpackage.dbn
    public final void m(hfl hflVar) {
        this.p.a();
        TranslateKeyboard f = f();
        if (f != null) {
            f.c.b = this.n;
            ezb ezbVar = this.v;
            if (ezbVar != null) {
                f.A(ezbVar.b());
            }
            f.H(z().f());
        }
        super.m(hflVar);
        if (f != null) {
            f.h = new een(this, 3);
            if (this != f.d) {
                f.d = this;
            }
            f.l();
            f.e = this;
            SoftKeyboardView softKeyboardView = f.a;
            if (softKeyboardView != null) {
                softKeyboardView.setOnTouchListener(f.e);
            }
            if (!af()) {
                this.g.e(ezo.OPEN, 3);
                ezb ezbVar2 = this.v;
                if (ezbVar2 != null) {
                    ezbVar2.c();
                }
                Y();
                return;
            }
            ai(false);
            ak();
            hqt A = A();
            if (!this.G && A != null) {
                ab(this.n.b.a(A.i().n), false);
            } else {
                this.G = false;
            }
            aa(false);
        }
    }

    @Override // defpackage.dbk, defpackage.dbn, defpackage.hfx
    public final synchronized boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z2, Map map, hfl hflVar) {
        gwv gwvVar = this.L;
        if (gwvVar.a == null) {
            gwvVar.a = new eyv(gwvVar, null, null);
            ((guh) gwvVar.a).e();
        }
        int i2 = 0;
        boolean z3 = hflVar == hfl.AUTO_TRANSLATE;
        this.K = z3;
        if (!z3 && !this.L.d(hqtVar, new emq(this, 15))) {
            return false;
        }
        Locale q = hqtVar.i().q();
        ezn eznVar = this.n;
        eznVar.b.c = q;
        eznVar.c.c = q;
        eznVar.c(q);
        boolean z4 = hflVar == hfl.AUTO_TRANSLATE;
        this.K = z4;
        if (!z4 || map == null) {
            this.x = null;
            this.w = null;
        } else {
            this.w = ah(map, "source");
            this.x = ah(map, "target");
            Object obj = map.get("force_language");
            boolean z5 = (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
            this.y = z5;
            this.G = z5;
        }
        if (this.m == null) {
            if (!li.e() || !((Boolean) z.c()).booleanValue()) {
                this.m = new faa(this.c);
            } else {
                this.m = new eyk(new SystemTranslateProvider(this.c), new faa(this.c));
            }
        }
        ai(true);
        eyn eynVar = this.m;
        if (eynVar != null) {
            eynVar.b();
        }
        if (this.v == null) {
            this.v = new ezb(this.c, this, this.m);
        }
        final ezb ezbVar = this.v;
        if (!ezbVar.d) {
            ezbVar.d = true;
            ezbVar.k = new eym() { // from class: eyy
                @Override // defpackage.eym
                public final void a(ezr ezrVar) {
                    ezb ezbVar2 = ezb.this;
                    int i3 = ezrVar.a;
                    if (i3 == 1) {
                        ezbVar2.e.e(ezo.CONNECTION_FAIL, 1);
                        ezbVar2.e(false);
                        return;
                    }
                    if (i3 == 3 || i3 == 4) {
                        ezbVar2.e.e(ezo.CONNECTION_FAIL, 4);
                    }
                    ezbVar2.e(true);
                }
            };
            ezbVar.g.e(ezbVar.h);
            int i3 = ezbVar.b;
            if (!jam.t(ezbVar.c)) {
                i2 = 3;
            } else if (ezbVar.b != 1 || System.currentTimeMillis() - ezbVar.i <= 30000) {
                i2 = i3;
            }
            ezbVar.f(i2, eyh.a(ezb.a(i2)));
        }
        am();
        this.l = 1;
        this.u = ap(editorInfo);
        try {
            ezc ezcVar = this.o;
            opu opuVar = new opu(this);
            if (!ezcVar.c) {
                ahh.a(ezcVar.a).b(ezcVar, new IntentFilter("android.text.style.SUGGESTION_PICKED"));
                ezcVar.c = true;
            }
            ezcVar.d = opuVar;
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) i.c()).i(e)).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "registerBroadcast", (char) 411, "TranslateUIExtension.java")).t("Failed to register broadcast:");
        }
        super.n(hqtVar, editorInfo, true, map, hflVar);
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TranslateKeyboard f = f();
        if (f == null || !ao(this.l)) {
            return false;
        }
        this.u = ap(z().f());
        this.l = true != TextUtils.isEmpty(((dbk) this).a) ? 2 : 1;
        ad(true);
        Y();
        if (!af()) {
            return false;
        }
        ak();
        f.H(z().f());
        return false;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final boolean p() {
        return true;
    }

    @Override // defpackage.dbn, defpackage.hfx
    public final void q() {
        if (this.e == null) {
            return;
        }
        int i2 = this.l;
        if (ao(i2) || !an(i2)) {
            return;
        }
        gyc.b.a(this.B, 200L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dbk, defpackage.dbn
    public final synchronized void r() {
        u(1);
        this.g.e(ezo.SESSION_COMMIT, Integer.valueOf(this.I));
        this.I = 0;
        this.p.a();
        this.n.b();
        ezb ezbVar = this.v;
        if (ezbVar != null && ezbVar.d) {
            ezbVar.d = false;
            ezbVar.g.g();
        }
        try {
            ezc ezcVar = this.o;
            if (ezcVar.c) {
                ahh.a(ezcVar.a).c(ezcVar);
                ezcVar.c = false;
            }
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) i.c()).i(e)).k("com/google/android/apps/inputmethod/libs/translate/TranslateUIExtension", "unRegisterBroadcast", (char) 450, "TranslateUIExtension.java")).t("Failed to unregister broadcast:");
        }
        eyt eytVar = this.q;
        if (eytVar != null) {
            eytVar.dismiss();
            this.q = null;
        }
        eyt eytVar2 = this.r;
        if (eytVar2 != null) {
            eytVar2.dismiss();
            this.r = null;
        }
        gwv gwvVar = this.L;
        Object obj = gwvVar.a;
        if (obj != null) {
            ((guh) obj).f();
            gwvVar.a = null;
        }
        gwvVar.b = null;
        eyn eynVar = this.m;
        if (eynVar != null) {
            eynVar.c();
        }
        this.l = 0;
        super.r();
        this.A = System.currentTimeMillis();
    }

    public final void u(int i2) {
        String str;
        if (!an(this.l) || !af()) {
            return;
        }
        this.l = 3;
        if (!TextUtils.isEmpty(((dbk) this).a)) {
            this.g.e(ezo.QUERY_LENGTH, Integer.valueOf(((dbk) this).a.length()));
            this.g.e(ezo.COMMIT, Integer.valueOf(i2));
            eyn eynVar = this.m;
            if (eynVar != null) {
                idk idkVar = this.g;
                ezo ezoVar = ezo.TRANSLATE_USING_OFFLINE;
                ezn eznVar = this.n;
                idkVar.e(ezoVar, Boolean.valueOf(eynVar.f(eznVar.b.d, eznVar.c.d)));
            }
            if (this.K && (str = this.w) != null && this.x != null) {
                String a = this.n.b.a(str);
                String a2 = this.n.c.a(this.x);
                idk idkVar2 = this.g;
                ezo ezoVar2 = ezo.TRANSLATE_USING_AUTOSHOW_LANGUAGE;
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(this.n.b.d.equals(a) && this.n.c.d.equals(a2));
                idkVar2.e(ezoVar2, objArr);
            }
            this.I++;
            this.p.a();
            if (i2 != 5) {
                hfw hfwVar = (hfw) z();
                if (hfwVar.S()) {
                    hfwVar.d.ax();
                }
                aj(true);
                Z(null);
            }
            ((dbk) this).a = "";
        } else {
            this.g.e(ezo.COMMIT, 3);
        }
        this.l = 1;
    }

    public final boolean ae(boolean z2, String str) {
        String str2 = z2 ? str : this.n.b.d;
        String str3 = z2 ? this.n.c.d : str;
        eyr eyrVar = z2 ? this.C : this.D;
        eyn eynVar = this.m;
        return (eynVar != null && eynVar.f(str2, str3)) || this.K || this.L.d(A(), new elr(eyrVar, str, 11));
    }

    @Override // defpackage.dbn, defpackage.hgb
    public final ids U(int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return ezs.EXT_TRANSLATE_DEACTIVATE;
            }
            if (i3 == 2) {
                return ezs.EXT_TRANSLATE_KB_ACTIVATE;
            }
            return idf.a;
        }
        return ezs.EXT_TRANSLATE_ACTIVATE;
    }

    private final void aj(boolean z2) {
        if (z2) {
            CharSequence charSequence = this.s;
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                Object[] spans = spannable.getSpans(0, charSequence.length(), Object.class);
                if (spans != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : spans) {
                        if ((spannable.getSpanFlags(obj) & 256) != 0) {
                            arrayList.add(obj);
                        }
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        spannable.removeSpan(arrayList.get(i2));
                    }
                }
            }
            z().x(this.s);
        } else {
            hfw hfwVar = (hfw) z();
            if (hfwVar.S()) {
                hfwVar.d.ay();
            }
        }
        this.s = "";
    }
}
