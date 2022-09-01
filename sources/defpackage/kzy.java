package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: kzy  reason: default package */
/* loaded from: classes.dex */
public final class kzy {
    public static final /* synthetic */ int b = 0;
    private static final Pattern c = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final kzr a;

    public kzy(kzr kzrVar) {
        this.a = kzrVar;
    }

    public static void a(laa laaVar, kzw kzwVar) {
        ZipFile zipFile;
        String[] strArr;
        try {
            zipFile = new ZipFile(laaVar.a);
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            String str = laaVar.b;
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = c.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", str, group2, group);
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new jma(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str2 : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str2)) {
                    String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str2);
                    for (jma jmaVar : (Set) hashMap.get(str2)) {
                        if (hashMap2.containsKey(jmaVar.b)) {
                            String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", jmaVar.b, str2);
                        } else {
                            hashMap2.put(jmaVar.b, jmaVar);
                            String.format("NativeLibraryExtractor: using library %s for ABI %s", jmaVar.b, str2);
                        }
                    }
                } else {
                    String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str2);
                }
            }
            kzwVar.a(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                }
            }
            throw e;
        }
    }

    public final void b(laa laaVar, Set set, kzx kzxVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jma jmaVar = (jma) it.next();
            File a = kzr.a(this.a.c(laaVar.b), (String) jmaVar.b);
            boolean z = false;
            if (a.exists() && a.length() == ((ZipEntry) jmaVar.a).getSize() && kzr.m(a)) {
                z = true;
            }
            kzxVar.a(jmaVar, a, z);
        }
    }
}
