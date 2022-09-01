package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import com.google.android.inputmethod.latin.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: bri  reason: default package */
/* loaded from: classes.dex */
public final class bri implements inj {
    private static final lug a = hin.a;
    private static final Pattern b = Pattern.compile("[0-9]+");

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        if (iniVar.g(R.string.f163360_resource_name_obfuscated_res_0x7f14078c) != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.versionName);
                sb.append("\n");
                sb.append(packageInfo.versionCode);
                sb.append("\n");
                String u = efq.u(context);
                if (u != null) {
                    sb.append(u);
                    sb.append("\n");
                }
                sb.append(fao.c());
                String a2 = diq.a(context);
                if (a2 != null) {
                    sb.append(a2);
                }
                String sb2 = sb.toString();
                SpannableString spannableString = new SpannableString(sb2);
                Matcher matcher = b.matcher(sb2);
                for (int length = packageInfo.versionName.length() + 1; length < sb2.length() && matcher.find(length); length = matcher.end()) {
                    spannableString.setSpan(new TtsSpan("android.type.digits", PersistableBundle.EMPTY), matcher.start(), matcher.end(), 0);
                }
                iniVar.m(R.string.f163360_resource_name_obfuscated_res_0x7f14078c, spannableString.toString());
            } catch (PackageManager.NameNotFoundException e) {
                ((luc) ((luc) a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/latin/preference/LatinAboutPreferenceInitializer", "initializePreference", 34, "LatinAboutPreferenceInitializer.java")).t("Failed to initialize about preference");
            }
        }
    }
}
