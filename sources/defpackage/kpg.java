package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kpg  reason: default package */
/* loaded from: classes.dex */
public final class kpg {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static llp a(Uri uri) {
        llp q;
        llk e = llp.e();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            q = llp.q();
        } else {
            q = llp.i(lfy.e("+").b().i(encodedFragment.substring(10)));
        }
        int size = q.size();
        for (int i = 0; i < size; i++) {
            String str = (String) q.get(i);
            Matcher matcher = a.matcher(str);
            if (matcher.matches()) {
                e.h(matcher.group(1));
            } else {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
        }
        return e.g();
    }

    public static String b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(lex.d("+").f(list));
    }
}
