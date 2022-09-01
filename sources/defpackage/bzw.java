package defpackage;

import android.content.Context;
import com.google.android.keyboard.client.delight5.DynamicLm;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: bzw  reason: default package */
/* loaded from: classes.dex */
public final class bzw {
    public static final Pattern a = Pattern.compile("blacklist.(.+).list");
    private static final Object b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mvm a(Context context, Locale locale) {
        return cbw.c(mvl.BLOCKLIST, new File(cbd.c.d(context), String.format(Locale.US, "blacklist.%s.list", locale.toString().toLowerCase(Locale.US))), locale);
    }

    public static List b(Context context, Map map) {
        ArrayList arrayList = new ArrayList();
        jan janVar = jan.b;
        synchronized (b) {
            File e = cbd.c.e(context, true);
            for (Map.Entry entry : map.entrySet()) {
                nfh t = mvm.l.t();
                mvl mvlVar = mvl.BLOCKLIST;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mvm mvmVar = (mvm) t.b;
                mvmVar.b = mvlVar.A;
                mvmVar.a |= 1;
                String absolutePath = ((File) entry.getValue()).getAbsolutePath();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mvm mvmVar2 = (mvm) t.b;
                absolutePath.getClass();
                mvmVar2.a |= 4;
                mvmVar2.d = absolutePath;
                if (DynamicLm.validateDynamicLm((mvm) t.cz())) {
                    File file = new File(e, (String) entry.getKey());
                    if (!file.exists() || janVar.e(file)) {
                        if (janVar.j((File) entry.getValue(), file)) {
                            arrayList.add((String) entry.getKey());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static void c(Context context) {
        cbd cbdVar = cbd.c;
        jan janVar = jan.b;
        synchronized (b) {
            File e = cbdVar.e(context, false);
            if (e.exists() && e.isDirectory()) {
                File[] listFiles = e.listFiles();
                if (listFiles != null && (r6 = listFiles.length) != 0) {
                    File d = cbdVar.d(context);
                    for (File file : listFiles) {
                        File file2 = new File(d, file.getName());
                        if (!file2.exists() || janVar.e(file2)) {
                            janVar.j(file, file2);
                        }
                    }
                    return;
                }
                janVar.e(e);
            }
        }
    }

    public static File[] d(Context context) {
        return cbd.c.d(context).listFiles(gbq.b);
    }
}
