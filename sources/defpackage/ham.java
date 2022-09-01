package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ham  reason: default package */
/* loaded from: classes.dex */
public final class ham {
    public static final hhl b;
    static final iqe c;
    static final hhl d;
    static final hhl e;
    static final iqe f;
    static final hhl g;
    private static final String[] i;
    private static final Pattern j;
    private static final Pattern k;
    private static final ltg h = ltg.j("com/google/android/libraries/inputmethod/editorinfo/EditorInfoUtil");
    public static final EditorInfo a = new EditorInfo();

    static {
        hhl h2 = hhq.h("apps_to_respect_type_text_flag_no_suggestions", (Build.VERSION.SDK_INT < 31 || !jam.u()) ? "com.google.android.apps.searchlite" : "com.google.android.apps.nexuslauncher,com.google.android.apps.searchlite");
        b = h2;
        c = iqe.e(h2, 3);
        d = hhq.a("hide_suggestions_in_opa", true);
        hhl h3 = hhq.h("apps_to_respect_no_auto_correction", "com.google.android.apps.nexuslauncher");
        e = h3;
        f = iqe.e(h3, 3);
        g = hhq.a("learning_for_editor_without_auto_correction", false);
        i = new String[]{"UNSPECIFIED", "NONE", "GO", "SEARCH", "SEND", "NEXT", "DONE", "PREVIOUS"};
        j = Pattern.compile("[;,]");
        k = Pattern.compile("=");
    }

    public static boolean A(EditorInfo editorInfo) {
        return (editorInfo == null || !E(editorInfo) || (editorInfo.inputType & 28672) == 0) ? false : true;
    }

    public static boolean B(EditorInfo editorInfo) {
        String m;
        if (han.CHROME.a(editorInfo)) {
            return true;
        }
        if (editorInfo != null && (m = m(editorInfo)) != null) {
            return m.startsWith("com.chrome");
        }
        return false;
    }

    public static boolean C(EditorInfo editorInfo) {
        return B(editorInfo) && ad(editorInfo) && E(editorInfo) && a(editorInfo) == 2 && (editorInfo.imeOptions & 301989888) != 0;
    }

    public static boolean D(int i2) {
        return c(i2) == 1;
    }

    public static boolean E(EditorInfo editorInfo) {
        return editorInfo != null && D(editorInfo.inputType);
    }

    public static boolean F(EditorInfo editorInfo) {
        return editorInfo != null && c(editorInfo.inputType) == 4;
    }

    public static boolean G(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            int d2 = d(i2);
            if (!D(i2)) {
                return false;
            }
            return d2 == 32 || d2 == 208;
        }
        return false;
    }

    public static boolean H(EditorInfo editorInfo) {
        int i2 = editorInfo.inputType;
        return D(i2) && d(i2) == 48;
    }

    public static boolean I(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & Integer.MIN_VALUE) == 0) ? false : true;
    }

    public static boolean J(Context context, EditorInfo editorInfo) {
        return editorInfo != null && editorInfo.extras != null && TextUtils.equals(context.getPackageName(), editorInfo.packageName) && editorInfo.extras.getByte("internal") == 1;
    }

    public static boolean K(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            int d2 = d(i2);
            return (D(i2) && (d2 == 128 || d2 == 224)) || S(i2);
        }
        return false;
    }

    public static boolean L(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            return D(i2) && (i2 & 131072) != 0;
        }
        return false;
    }

    public static boolean M(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & 268435456) == 0) ? false : true;
    }

    public static boolean N(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & 33554432) == 0) ? false : true;
    }

    public static boolean O(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & 16777216) == 0) ? false : true;
    }

    public static boolean P(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            return D(i2) && !aa(i2);
        }
        return false;
    }

    public static boolean Q(int i2) {
        return c(i2) == 2;
    }

    public static boolean R(EditorInfo editorInfo) {
        return editorInfo != null && Q(editorInfo.inputType);
    }

    public static boolean S(int i2) {
        return Q(i2) && d(i2) == 16;
    }

    public static boolean T(EditorInfo editorInfo) {
        return editorInfo != null && S(editorInfo.inputType);
    }

    public static boolean U(EditorInfo editorInfo) {
        return T(editorInfo) || ab(editorInfo);
    }

    public static boolean V(EditorInfo editorInfo) {
        int e2 = e(editorInfo);
        return e2 == 128 || e2 == 224 || e2 == 144 || R(editorInfo) || F(editorInfo) || W(editorInfo);
    }

    public static boolean W(EditorInfo editorInfo) {
        return editorInfo != null && c(editorInfo.inputType) == 3;
    }

    public static boolean X(EditorInfo editorInfo) {
        return (editorInfo == null || editorInfo.extras == null || !editorInfo.extras.getBoolean("allowEmoji", false)) ? false : true;
    }

    public static boolean Y(EditorInfo editorInfo) {
        return editorInfo != null && E(editorInfo) && !G(editorInfo) && !ad(editorInfo);
    }

    public static boolean Z(EditorInfo editorInfo, boolean z) {
        if (af(editorInfo, z) || C(editorInfo) || han.AGSA.a(editorInfo)) {
            return true;
        }
        return han.LAUNCHER.a(editorInfo) && E(editorInfo) && a(editorInfo) == 3 && (editorInfo.imeOptions & 301989888) != 0;
    }

    public static int a(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return 0;
        }
        return editorInfo.imeOptions & 255;
    }

    public static boolean aa(int i2) {
        int d2 = d(i2);
        if (D(i2)) {
            return d2 == 128 || d2 == 144 || d2 == 224;
        }
        return false;
    }

    public static boolean ab(EditorInfo editorInfo) {
        return editorInfo != null && aa(editorInfo.inputType);
    }

    public static boolean ac(EditorInfo editorInfo) {
        return editorInfo == null || editorInfo.inputType == 0;
    }

    public static boolean ad(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            return D(i2) && d(i2) == 16;
        }
        return false;
    }

    public static boolean ae(EditorInfo editorInfo) {
        if (editorInfo != null) {
            int i2 = editorInfo.inputType;
            return D(i2) && d(i2) == 160;
        }
        return false;
    }

    public static boolean af(EditorInfo editorInfo, boolean z) {
        if (!han.YOUTUBE.a(editorInfo)) {
            return false;
        }
        if (!z) {
            return w(editorInfo);
        }
        String az = az("com.google.android.youtube.searchbox", editorInfo);
        if (az != null) {
            return TextUtils.equals("e", az);
        }
        return false;
    }

    public static boolean ag(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "noDecoding", editorInfo);
    }

    public static boolean ah(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "noScrubbing", editorInfo);
    }

    public static boolean ai(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "disableSmartCompose", editorInfo);
    }

    public static boolean aj(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "disallowEmojiBar", editorInfo);
    }

    public static boolean ak(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "disallowEmojiKeyboard", editorInfo);
    }

    public static boolean al(EditorInfo editorInfo) {
        return editorInfo != null && E(editorInfo) && (editorInfo.inputType & 65536) == 0;
    }

    public static boolean am(EditorInfo editorInfo) {
        if (editorInfo == null || !E(editorInfo) || V(editorInfo)) {
            return false;
        }
        if (!ae(editorInfo) && !G(editorInfo) && !ad(editorInfo)) {
            int i2 = editorInfo.inputType;
            int d2 = d(i2);
            if (!D(i2) || d2 != 176) {
                int i3 = editorInfo.inputType;
                int d3 = d(i3);
                if (!D(i3) || d3 != 192) {
                    return (editorInfo.inputType & 524288) != 0 ? (editorInfo.inputType & 32768) != 0 : (editorInfo.inputType & 32768) != 0 || !z(f, editorInfo);
                }
            }
        }
        return (editorInfo.inputType & 32768) != 0;
    }

    public static boolean an(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "darkMode", editorInfo);
    }

    public static boolean ao(EditorInfo editorInfo) {
        if (E(editorInfo) && !V(editorInfo)) {
            if (G(editorInfo)) {
                return true;
            }
            if ((editorInfo.inputType & 4096) != 0 || (editorInfo.inputType & 8192) != 0) {
                return false;
            }
            return ((Boolean) g.c()).booleanValue() || am(editorInfo);
        }
        return false;
    }

    public static boolean ap(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "hideHeaderOnInitialState", editorInfo);
    }

    public static boolean aq(Context context, EditorInfo editorInfo) {
        if (han.AGSA.a(editorInfo) || J(context, editorInfo)) {
            return y(context.getPackageName(), "noMicrophoneKey", editorInfo) || y(null, "nm", editorInfo);
        }
        return false;
    }

    public static boolean ar(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "noSettingsKey", editorInfo);
    }

    public static boolean as(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "sendDictationEvents", editorInfo);
    }

    public static boolean at(EditorInfo editorInfo) {
        if (editorInfo == null || editorInfo.inputType == 0) {
            return true;
        }
        return E(editorInfo) && !V(editorInfo) && (editorInfo.inputType & 524288) == 0;
    }

    public static boolean au(EditorInfo editorInfo, ino inoVar, boolean z) {
        if (z) {
            return true;
        }
        if (editorInfo != null) {
            String m = m(editorInfo);
            if (TextUtils.isEmpty(m) || (editorInfo.inputType & 524288) == 0 || !c.j(m)) {
                if (han.AGSA.a(editorInfo) && y(null, "opa", editorInfo) && ((Boolean) d.c()).booleanValue()) {
                    ((ltd) ((ltd) h.b()).k("com/google/android/libraries/inputmethod/editorinfo/EditorInfoUtil", "shouldShowSuggestions", 991, "EditorInfoUtil.java")).t("Suggestion strip should be disabled in OPA.");
                    return false;
                }
            } else {
                ((ltd) ((ltd) h.b()).k("com/google/android/libraries/inputmethod/editorinfo/EditorInfoUtil", "shouldShowSuggestions", 985, "EditorInfoUtil.java")).t("Suggestion strip should be disabled due to TYPE_TEXT_FLAG_NO_SUGGESTIONS");
                return false;
            }
        }
        return inoVar.am(R.string.f161950_resource_name_obfuscated_res_0x7f1406e4, R.bool.f20430_resource_name_obfuscated_res_0x7f05007c, false, false);
    }

    public static boolean av(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "startEmojiInput", editorInfo);
    }

    public static boolean aw(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "startVoiceInput", editorInfo);
    }

    public static String ax(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
            sb.append(",");
        }
        sb.append(h(str, "noDecoding"));
        return sb.toString();
    }

    public static int ay(EditorInfo editorInfo, int i2) {
        return (editorInfo.imeOptions & 16777216) | (i2 & (-16777217));
    }

    public static String az(String str, EditorInfo editorInfo) {
        if (editorInfo != null && editorInfo.privateImeOptions != null) {
            for (String str2 : lfy.f(j).i(editorInfo.privateImeOptions)) {
                List k2 = lfy.f(k).k(str2);
                if (k2.size() == 2 && TextUtils.equals((CharSequence) k2.get(0), str)) {
                    return (String) k2.get(1);
                }
            }
        }
        return null;
    }

    public static int b(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = i;
            int length = strArr.length;
            if (i2 < 8) {
                if (strArr[i2].equalsIgnoreCase(str)) {
                    return i2;
                }
                i2++;
            } else {
                return 0;
            }
        }
    }

    public static int c(int i2) {
        int i3 = i2 & 15;
        if (i3 != 0 || d(i2) == 0) {
            return i3;
        }
        return 1;
    }

    public static int d(int i2) {
        return i2 & 4080;
    }

    public static int e(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return 0;
        }
        return d(editorInfo.inputType);
    }

    public static Bitmap.CompressFormat f(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return null;
        }
        return jbc.a(n(editorInfo));
    }

    public static Object g(EditorInfo editorInfo) {
        return new hal(editorInfo);
    }

    public static String h(String str, String str2) {
        if (str != null) {
            return str + "." + str2;
        }
        return str2;
    }

    public static String i(EditorInfo editorInfo) {
        String str = "";
        if (editorInfo == null) {
            return str;
        }
        if (editorInfo.packageName != null) {
            str = editorInfo.packageName;
        }
        int i2 = editorInfo.fieldId;
        int i3 = editorInfo.inputType;
        return str + "/" + i2 + "/" + i3;
    }

    public static String j(int i2) {
        String[] strArr = i;
        int length = strArr.length;
        if (i2 >= 8) {
            i2 = 0;
        }
        return strArr[i2];
    }

    public static String k(EditorInfo editorInfo) {
        return j(a(editorInfo));
    }

    public static String l(EditorInfo editorInfo) {
        String str;
        String str2 = "null";
        if (editorInfo == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("inputType=0x");
        sb.append(Integer.toHexString(editorInfo.inputType));
        sb.append("(");
        if (E(editorInfo)) {
            switch (e(editorInfo)) {
                case 0:
                    str = "Normal";
                    break;
                case 16:
                    str = "Uri";
                    break;
                case 32:
                    str = "EmailAddress";
                    break;
                case 48:
                    str = "EmailSubject";
                    break;
                case 64:
                    str = "ShortMessage";
                    break;
                case 80:
                    str = "LongMessage";
                    break;
                case 96:
                    str = "PersonName";
                    break;
                case 112:
                    str = "PostalAddress";
                    break;
                case 128:
                    str = "Password";
                    break;
                case 144:
                    str = "VisiblePassword";
                    break;
                case 160:
                    str = "WebEditText";
                    break;
                case 176:
                    str = "Filter";
                    break;
                case 192:
                    str = "Phonetic";
                    break;
                case 208:
                    str = "WebEmailAddress";
                    break;
                case 224:
                    str = "WebPassword";
                    break;
                default:
                    str = "TextUnknown";
                    break;
            }
        } else if (F(editorInfo)) {
            int e2 = e(editorInfo);
            str = e2 != 0 ? e2 != 16 ? e2 != 32 ? "DateTimeUnknown" : "Time" : "Date" : "DateTime";
        } else if (R(editorInfo)) {
            int e3 = e(editorInfo);
            str = e3 != 0 ? e3 != 16 ? "NumberUnknown" : "NumberPassword" : "Number";
        } else if (W(editorInfo)) {
            str = "Phone";
        } else {
            str = ac(editorInfo) ? "NULL" : "Unknown";
        }
        sb.append(str);
        sb.append(") imeOptions=0x");
        sb.append(Integer.toHexString(editorInfo.imeOptions));
        sb.append(" privateImeOptions=");
        sb.append(editorInfo.privateImeOptions);
        sb.append(" actionName=");
        sb.append(k(editorInfo));
        sb.append(" actionLabel=");
        sb.append(editorInfo.actionLabel);
        sb.append(" actionId=");
        sb.append(editorInfo.actionId);
        sb.append(" initialSelStart=");
        sb.append(editorInfo.initialSelStart);
        sb.append(" initialSelEnd=");
        sb.append(editorInfo.initialSelEnd);
        sb.append(" initialCapsMode=0x");
        sb.append(Integer.toHexString(editorInfo.initialCapsMode));
        sb.append(" hintText=");
        CharSequence charSequence = editorInfo.hintText;
        if (charSequence != null) {
            str2 = charSequence.length() == 0 ? "empty" : "non-empty";
        }
        sb.append(str2);
        sb.append(" label=");
        sb.append(editorInfo.label);
        sb.append(" packageName=");
        sb.append(editorInfo.packageName);
        sb.append(" fieldId=");
        sb.append(editorInfo.fieldId);
        sb.append(" fieldName=");
        sb.append(editorInfo.fieldName);
        sb.append(" extras=");
        sb.append(editorInfo.extras);
        return sb.toString();
    }

    public static String m(EditorInfo editorInfo) {
        if (TextUtils.equals(editorInfo.packageName, han.KEYBOARD_DEV_UTILS.l)) {
            String az = az("packageNameOverride", editorInfo);
            return az != null ? az : editorInfo.packageName;
        }
        return editorInfo.packageName;
    }

    public static List n(EditorInfo editorInfo) {
        return Arrays.asList(abu.c(editorInfo));
    }

    public static Locale o(EditorInfo editorInfo) {
        LocaleList localeList;
        if (Build.VERSION.SDK_INT >= 24 && (localeList = editorInfo.hintLocales) != null) {
            for (int i2 = 0; i2 < localeList.size(); i2++) {
                Locale locale = localeList.get(i2);
                if (!TextUtils.isEmpty(locale.toString())) {
                    return locale;
                }
            }
        }
        return null;
    }

    public static void p(EditorInfo editorInfo, Printer printer) {
        String str;
        if (editorInfo == null) {
            printer.println("null");
            return;
        }
        if (F(editorInfo)) {
            str = "DateTime";
        } else if (W(editorInfo)) {
            str = "PhoneNumber";
        } else if (R(editorInfo)) {
            str = "Number";
        } else if (G(editorInfo)) {
            str = "Email";
        } else if (ab(editorInfo)) {
            str = "Password";
        } else {
            str = ad(editorInfo) ? "URI" : "Text";
        }
        printer.println("inputTypeString = ".concat(str));
        printer.println("imeActionName = ".concat(String.valueOf(k(editorInfo))));
        editorInfo.dump(printer, "");
    }

    public static void q(TextView textView) {
        Bundle inputExtras = textView.getInputExtras(true);
        if (inputExtras == null) {
            throw new IllegalArgumentException("Invalid editBox");
        }
        inputExtras.putByte("internal", (byte) 1);
    }

    public static boolean r(EditorInfo editorInfo, String str) {
        if (editorInfo == null || str == null) {
            return false;
        }
        return jbc.g(str, n(editorInfo));
    }

    public static boolean s(Context context, EditorInfo editorInfo) {
        return y(context.getPackageName(), "appSupportsSmartCompose", editorInfo);
    }

    public static boolean t(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & 134217728) == 0) ? false : true;
    }

    public static boolean u(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & 67108864) == 0) ? false : true;
    }

    public static boolean v(EditorInfo editorInfo) {
        return editorInfo != null && (editorInfo.imeOptions & 1073741824) == 0;
    }

    public static boolean w(EditorInfo editorInfo) {
        return a(editorInfo) == 3;
    }

    public static boolean x(Context context, EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.inputType & 96) == 0 || !y(context.getPackageName(), "requestPhoneticOutput", editorInfo)) ? false : true;
    }

    public static boolean y(String str, String str2, EditorInfo editorInfo) {
        if (editorInfo != null && editorInfo.privateImeOptions != null) {
            String h2 = h(str, str2);
            for (String str3 : lfy.f(j).i(editorInfo.privateImeOptions)) {
                if (str3.equals(h2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean z(iqe iqeVar, EditorInfo editorInfo) {
        return editorInfo != null && iqeVar.j(m(editorInfo));
    }
}
