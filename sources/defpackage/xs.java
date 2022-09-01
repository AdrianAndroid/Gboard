package defpackage;

import android.text.Spannable;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: xs  reason: default package */
/* loaded from: classes2.dex */
public final class xs {
    public static final Comparator a = xr.a;

    public static void a(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    bkc bkcVar = new bkc();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        String str = strArr[i];
                        int i2 = i;
                        if (group.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!group.regionMatches(false, 0, str, 0, str.length())) {
                                group = String.valueOf(str).concat(String.valueOf(group.substring(str.length())));
                            }
                        } else {
                            i = i2 + 1;
                        }
                    }
                    if (!z) {
                        group = String.valueOf(strArr[0]).concat(group);
                    }
                    bkcVar.c = group;
                    bkcVar.a = start;
                    bkcVar.b = end;
                    arrayList.add(bkcVar);
                }
            }
        }
    }
}
