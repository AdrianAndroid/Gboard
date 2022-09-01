package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.keyboard.client.delight5.DynamicLm;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: cfm  reason: default package */
/* loaded from: classes.dex */
public final class cfm {
    public static final cbd a = cbd.c;
    public static final jan b = jan.b;
    public static final Object c = new Object();

    public static File a(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder("UserHistory.");
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(".");
            sb.append(str2);
        }
        sb.append(".dict");
        cbd cbdVar = a;
        File d = cbdVar.d(context);
        File g = cbdVar.g(context);
        File file = new File(d, sb.toString());
        File file2 = new File(g, sb.toString());
        return !TextUtils.isEmpty(str2) ? file : (!file.exists() || file2.exists()) ? file2 : file;
    }

    public static List b(Context context, String str) {
        String str2;
        ArrayList A = lre.A();
        for (mvm mvmVar : c(context, new TreeSet())) {
            String name = new File(mvmVar.d).getName();
            int i = 0;
            int i2 = 0;
            while (true) {
                int indexOf = name.indexOf(".", i);
                str2 = null;
                if (i2 != 2) {
                    if (indexOf < 0 || indexOf == name.length() - 1) {
                        break;
                    }
                    i = indexOf + 1;
                    i2++;
                } else {
                    int lastIndexOf = name.lastIndexOf(".");
                    if (i < lastIndexOf) {
                        str2 = name.substring(i, lastIndexOf);
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    A.add(mvmVar);
                }
            } else if (str.equals(str2)) {
                A.add(mvmVar);
            }
        }
        return A;
    }

    public static List c(Context context, Set set) {
        int i;
        int indexOf;
        ArrayList arrayList = new ArrayList();
        cbd cbdVar = a;
        File[] listFiles = cbdVar.d(context).listFiles();
        File[] listFiles2 = cbdVar.g(context).listFiles();
        ArrayList arrayList2 = new ArrayList();
        if (listFiles != null) {
            arrayList2.addAll(Arrays.asList(listFiles));
        }
        if (listFiles2 != null) {
            arrayList2.addAll(Arrays.asList(listFiles2));
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            File file = (File) arrayList2.get(i2);
            if (file.getName().startsWith("UserHistory") && !file.isDirectory() && !set.contains(file.getAbsolutePath())) {
                String name = file.getName();
                int indexOf2 = name.indexOf(".");
                mvm mvmVar = null;
                String substring = (indexOf2 >= 0 && (indexOf = name.indexOf(".", (i = indexOf2 + 1))) >= 0) ? name.substring(i, indexOf) : null;
                if (substring != null) {
                    if (!substring.contains("-")) {
                        mvmVar = cbw.c(mvl.USER_HISTORY, file, jay.f(substring));
                    } else {
                        mvl mvlVar = mvl.USER_HISTORY;
                        ArrayList A = lre.A();
                        for (String str : TextUtils.split(substring, "-")) {
                            A.add(jay.f(str));
                        }
                        mvmVar = cbw.f(mvlVar, file, A);
                    }
                }
                if (mvmVar != null) {
                    arrayList.add(mvmVar);
                }
            }
        }
        return arrayList;
    }

    public static List d(Context context, Map map) {
        ArrayList arrayList = new ArrayList();
        synchronized (c) {
            File f = a.f(context, true);
            for (Map.Entry entry : map.entrySet()) {
                nfh t = mvm.l.t();
                mvl mvlVar = mvl.USER_HISTORY;
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
                mvm mvmVar3 = (mvm) t.b;
                mvmVar3.k = 159107666;
                mvmVar3.a |= 512;
                if (DynamicLm.validateDynamicLm((mvm) t.cz())) {
                    File file = new File(f, (String) entry.getKey());
                    if (!file.exists() || b.e(file)) {
                        if (b.j((File) entry.getValue(), file)) {
                            arrayList.add((String) entry.getKey());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean e(String str, String str2, Context context) {
        if (!TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        ieh j = ieh.j();
        cbd cbdVar = a;
        File g = cbdVar.g(context);
        File d = cbdVar.d(context);
        File file2 = new File(g, file.getName());
        File file3 = new File(d, file.getName());
        if (!file2.exists() || !file3.exists()) {
            j.e(cap.USER_HISTORY_DUPLICATE_FILES_EXIST, false);
            if (file.equals(file3)) {
                long length = file.length();
                jan janVar = b;
                if (!janVar.j(file3, file2) || file2.length() != length) {
                    j.e(cap.USER_HISTORY_MIGRATION_RESULT, false);
                    if (!file2.exists()) {
                        j.e(cap.USER_HISTORY_MIGRATION_FAILURE_TYPE, 1);
                    }
                    if (file3.exists()) {
                        j.e(cap.USER_HISTORY_MIGRATION_FAILURE_TYPE, 2);
                    }
                    if (file2.exists() && file2.length() != length) {
                        j.e(cap.USER_HISTORY_MIGRATION_FAILURE_TYPE, 3);
                        j.e(cap.USER_HISTORY_DUPLICATE_FILE_SIZE_DIFF, Long.valueOf(Math.abs(file2.length() - length)));
                        if (!file.exists()) {
                            return true;
                        }
                        janVar.e(file2);
                    }
                } else {
                    j.e(cap.USER_HISTORY_MIGRATION_RESULT, true);
                    return true;
                }
            }
            return false;
        }
        j.e(cap.USER_HISTORY_DUPLICATE_FILES_EXIST, true);
        j.e(cap.USER_HISTORY_DUPLICATE_FILE_SIZE_DIFF, Long.valueOf(Math.abs(file2.length() - file3.length())));
        if (b.e(file3)) {
            j.e(cap.USER_HISTORY_DUPLICATE_FILE_DELETE_RESULT, true);
            return file.equals(file3);
        }
        j.e(cap.USER_HISTORY_DUPLICATE_FILE_DELETE_RESULT, false);
        return false;
    }

    public static mvm f(Context context, Locale locale, String str, int i) {
        mvm c2 = cbw.c(mvl.USER_HISTORY, a(context, String.valueOf(locale), str), locale);
        nfh nfhVar = (nfh) c2.N(5);
        nfhVar.cG(c2);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mvm mvmVar = (mvm) nfhVar.b;
        mvm mvmVar2 = mvm.l;
        mvmVar.k = i;
        mvmVar.a |= 512;
        return (mvm) nfhVar.cz();
    }
}
