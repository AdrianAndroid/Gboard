package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.apps.inputmethod.latin.ImeLatinApp;
import com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard;
import com.google.android.gms.common.api.Status;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bpn  reason: default package */
/* loaded from: classes.dex */
public final class bpn implements mka {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public bpn(ImeLatinApp imeLatinApp, String str, SharedPreferences sharedPreferences, String str2, int i) {
        this.e = i;
        this.b = imeLatinApp;
        this.c = str;
        this.d = sharedPreferences;
        this.a = str2;
    }

    public bpn(LatinPrimeKeyboard latinPrimeKeyboard, mko mkoVar, hqt hqtVar, String str, int i) {
        this.e = i;
        this.d = latinPrimeKeyboard;
        this.a = mkoVar;
        this.b = hqtVar;
        this.c = str;
    }

    public bpn(dnn dnnVar, mko mkoVar, Preference preference, jav javVar, int i) {
        this.e = i;
        this.b = dnnVar;
        this.c = mkoVar;
        this.d = preference;
        this.a = javVar;
    }

    public bpn(dtu dtuVar, jav javVar, TextToSpeech textToSpeech, String str, int i) {
        this.e = i;
        this.b = dtuVar;
        this.a = javVar;
        this.d = textToSpeech;
        this.c = str;
    }

    public bpn(els elsVar, EditorInfo editorInfo, Set set, String str, int i) {
        this.e = i;
        this.b = elsVar;
        this.d = editorInfo;
        this.c = set;
        this.a = str;
    }

    public bpn(emh emhVar, els elsVar, View view, IBinder iBinder, int i) {
        this.e = i;
        this.c = emhVar;
        this.a = elsVar;
        this.b = view;
        this.d = iBinder;
    }

    public bpn(epe epeVar, String str, File file, File file2, int i) {
        this.e = i;
        this.d = epeVar;
        this.c = str;
        this.a = file;
        this.b = file2;
    }

    public bpn(fpo fpoVar, jns jnsVar, Executor executor, Context context, int i) {
        this.e = i;
        this.b = fpoVar;
        this.a = jnsVar;
        this.c = executor;
        this.d = context;
    }

    private final void c() {
        dnn.aF((dnn) this.b);
        Toast.makeText(((an) this.b).B(), (int) R.string.f176610_resource_name_obfuscated_res_0x7f140ce7, 1).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, hqt] */
    /* JADX WARN: Type inference failed for: r0v7, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, hqt] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.e) {
            case 0:
                ((ltd) ((ltd) ((ltd) LatinPrimeKeyboard.c.d()).i(th)).k("com/google/android/apps/inputmethod/latin/keyboard/LatinPrimeKeyboard$1", "onFailure", 479, "LatinPrimeKeyboard.java")).G("Failed to load ime def of languageTag %s, variant %s", this.b.i(), this.c);
                ((LatinPrimeKeyboard) this.d).h.u(this.a, null, this.b);
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) ImeLatinApp.a.c()).i(th)).k("com/google/android/apps/inputmethod/latin/ImeLatinApp$2", "onFailure", 'm', "ImeLatinApp.java")).t("fail to fetch theme file");
                return;
            case 2:
                if (((dnn) this.b).al != this.c) {
                    return;
                }
                ((ltd) ((ltd) ((ltd) dnn.aj.c()).i(th)).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageTagListPreferenceFragment$1", "onFailure", 174, "LanguageTagListPreferenceFragment.java")).w("Failed to check input method entries for language %s", this.a);
                c();
                return;
            case 3:
                ((TextToSpeech) this.d).shutdown();
                ((ltd) ((ltd) ((ltd) dtu.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/input/TextToSpeechController$2", "onFailure", (char) 135, "TextToSpeechController.java")).t("TextToSpeech failed to initialize");
                ker.p(((dtu) this.b).d, R.string.f158750_resource_name_obfuscated_res_0x7f140571, new Object[0]);
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) els.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/sharing/GboardSharingUtil$1", "onFailure", (char) 224, "GboardSharingUtil.java")).t("Failed to get createShortDynamicLink future callback.");
                Object obj = this.b;
                els elsVar = (els) obj;
                elsVar.j((EditorInfo) this.d, this.c, (String) this.a);
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) emh.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/sharing/SharingLinkReceiveModule$2", "onFailure", (char) 141, "SharingLinkReceiveModule.java")).t("Failed to get method getInputMethodEntry future callback.");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) epe.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportEntrance$1", "onFailure", 'l', "QualityBugReportEntrance.java")).t("Failed to link to Better Bug in work profile.");
                Object obj2 = this.d;
                Object obj3 = this.c;
                String str = (String) obj3;
                epe epeVar = (epe) obj2;
                epeVar.d(str, (File) this.a, (File) this.b);
                return;
            default:
                this.c.execute(new fso(th, (Context) this.d, 6));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [fpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, hqt] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        Locale locale;
        switch (this.e) {
            case 0:
                ((LatinPrimeKeyboard) this.d).h.u(this.a, (iav) obj, this.b);
                return;
            case 1:
                byte[] bArr = (byte[]) obj;
                File e = erj.e((Context) this.b, (String) this.c);
                File parentFile = e.getParentFile();
                if (parentFile != null) {
                    jan.b.h(parentFile);
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(e);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    this.d.edit().putString((String) this.a, (String) this.c).apply();
                    return;
                } catch (IOException e2) {
                    a(e2);
                    return;
                }
            case 2:
                Boolean bool = (Boolean) obj;
                if (((dnn) this.b).al != this.c) {
                    return;
                }
                if (!bool.booleanValue()) {
                    ((ltd) ((ltd) dnn.aj.c()).k("com/google/android/apps/inputmethod/libs/languageselection/preference/LanguageTagListPreferenceFragment$1", "onSuccess", 164, "LanguageTagListPreferenceFragment.java")).w("The language %s is unavailable", this.a);
                    c();
                    return;
                }
                dnn.aF((dnn) this.b);
                ((dnn) this.b).aD((Preference) this.d);
                return;
            case 3:
                Void r7 = (Void) obj;
                String str = ((jav) this.a).n;
                ltg ltgVar = dtu.a;
                String[] split = str.split("[-_]", 3);
                int length = split.length;
                if (length == 0) {
                    throw new IllegalArgumentException("Invalid locale: '" + str + "'");
                }
                if (length == 1) {
                    locale = new Locale(split[0]);
                } else if (length != 2) {
                    locale = new Locale(split[0], split[1], split[2]);
                } else {
                    locale = new Locale(split[0], split[1]);
                }
                if (((TextToSpeech) this.d).isLanguageAvailable(locale) < 0) {
                    ker.p(((dtu) this.b).d, R.string.f158750_resource_name_obfuscated_res_0x7f140571, new Object[0]);
                    ((TextToSpeech) this.d).shutdown();
                    return;
                }
                ((TextToSpeech) this.d).setLanguage(locale);
                if (((TextToSpeech) this.d).speak(this.c, 1, dtu.c, "SmartDictation TTS") != -1) {
                    return;
                }
                ker.p(((dtu) this.b).d, R.string.f158750_resource_name_obfuscated_res_0x7f140571, new Object[0]);
                ((TextToSpeech) this.d).shutdown();
                return;
            case 4:
                Object obj2 = this.b;
                Object obj3 = this.d;
                EditorInfo editorInfo = (EditorInfo) obj3;
                els elsVar = (els) obj2;
                elsVar.j(editorInfo, this.c, (String) obj);
                return;
            case 5:
                if (((gzm) this.a).k((List) obj).isEmpty()) {
                    return;
                }
                Object obj4 = this.c;
                Object obj5 = this.b;
                ?? r1 = this.d;
                Rect rect = new Rect();
                View view = (View) obj5;
                view.getWindowVisibleDisplayFrame(rect);
                emh emhVar = (emh) obj4;
                emhVar.b = new emf(view.getContext(), r1, rect.height());
                emhVar.b.show();
                return;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((ltd) ((ltd) epe.a.c()).k("com/google/android/apps/inputmethod/libs/swissarmyknife/QualityBugReportEntrance$1", "onSuccess", 101, "QualityBugReportEntrance.java")).t("Better Bug is not available in work profile.");
                Object obj6 = this.d;
                Object obj7 = this.c;
                String str2 = (String) obj7;
                epe epeVar = (epe) obj6;
                epeVar.d(str2, (File) this.a, (File) this.b);
                return;
            default:
                gni.i(this.b, (Status) obj, (jns) this.a);
                return;
        }
    }
}
