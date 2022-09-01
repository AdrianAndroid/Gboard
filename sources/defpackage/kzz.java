package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: kzz  reason: default package */
/* loaded from: classes.dex */
public final class kzz {
    public static final AtomicReference a = new AtomicReference(null);
    public final kzr b;
    public final Set c = new HashSet();
    private final lbi d;
    private final laq e;

    private kzz(Context context) {
        try {
            this.b = new kzr(context);
            this.e = new laq();
            this.d = new lbi(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new laj(e);
        }
    }

    public static boolean b(Context context, boolean z) {
        boolean z2;
        AtomicReference atomicReference = a;
        kzz kzzVar = new kzz(context);
        while (true) {
            if (!atomicReference.compareAndSet(null, kzzVar)) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        kzz kzzVar2 = (kzz) a.get();
        if (z2) {
            lar larVar = lar.a;
            lar.b.set(new lab(context, laq.c(), new lac(context, kzzVar2.b), kzzVar2.b));
            opu opuVar = new opu(kzzVar2);
            AtomicReference atomicReference2 = lat.a;
            while (!atomicReference2.compareAndSet(null, opuVar) && atomicReference2.get() == null) {
            }
            laq.c().execute(new kvl(context, 6));
        }
        try {
            kzzVar2.c(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    private final synchronized void c(Context context, boolean z) {
        List<String> asList;
        lag lagVar;
        IOException iOException;
        ZipFile zipFile;
        ZipFile zipFile2;
        if (z) {
            this.b.j();
        } else {
            laq.c().execute(new kvl(this, 7));
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.splitNames == null) {
                asList = new ArrayList();
            } else {
                asList = Arrays.asList(packageInfo.splitNames);
            }
            Set<laa> i = this.b.i();
            Set b = this.d.b();
            HashSet hashSet = new HashSet();
            Iterator it = i.iterator();
            while (it.hasNext()) {
                String str = ((laa) it.next()).b;
                if (asList.contains(str) || b.contains(lav.a(str))) {
                    hashSet.add(str);
                    it.remove();
                }
            }
            if (!z) {
                if (!hashSet.isEmpty()) {
                    laq.c().execute(new kht(this, hashSet, 9));
                }
            } else {
                a(hashSet);
            }
            HashSet hashSet2 = new HashSet();
            for (laa laaVar : i) {
                String str2 = laaVar.b;
                if (!lav.e(str2)) {
                    hashSet2.add(str2);
                }
            }
            for (String str3 : asList) {
                if (!lav.e(str3)) {
                    hashSet2.add(str3);
                }
            }
            HashSet<laa> hashSet3 = new HashSet(i.size());
            for (laa laaVar2 : i) {
                if (lav.d(laaVar2.b) || hashSet2.contains(lav.a(laaVar2.b))) {
                    hashSet3.add(laaVar2);
                }
            }
            kzy kzyVar = new kzy(this.b);
            int i2 = 3;
            switch (Build.VERSION.SDK_INT) {
                case 23:
                    lagVar = new lag(0);
                    break;
                case 24:
                    lagVar = new lag(2);
                    break;
                case 25:
                    lagVar = new lag(3);
                    break;
                case 26:
                    lagVar = new lag(4);
                    break;
                case 27:
                    if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                        lagVar = new lag(5);
                        break;
                    }
                    lagVar = new lag(6);
                    break;
                default:
                    lagVar = new lag(6);
                    break;
            }
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                Set<laa> i3 = kzyVar.a.i();
                kzr kzrVar = kzyVar.a;
                ArrayList<String> arrayList = new ArrayList();
                File[] listFiles = kzrVar.b().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            arrayList.add(file.getName());
                        }
                    }
                }
                for (String str4 : arrayList) {
                    Iterator it2 = i3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((laa) it2.next()).b.equals(str4)) {
                                break;
                            }
                        } else {
                            Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str4));
                            kzr.k(kzyVar.a.c(str4));
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (laa laaVar3 : i3) {
                    HashSet hashSet5 = new HashSet();
                    kzy.a(laaVar3, new kzu(kzyVar, hashSet5, laaVar3));
                    kzr kzrVar2 = kzyVar.a;
                    String str5 = laaVar3.b;
                    HashSet<File> hashSet6 = new HashSet();
                    File[] listFiles2 = kzrVar2.c(str5).listFiles();
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            if (file2.isFile()) {
                                hashSet6.add(file2);
                            }
                        }
                    }
                    for (File file3 : hashSet6) {
                        if (!hashSet5.contains(file3)) {
                            Object[] objArr = new Object[i2];
                            objArr[0] = file3.getAbsolutePath();
                            objArr[1] = laaVar3.b;
                            objArr[2] = laaVar3.a.getAbsolutePath();
                            Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", objArr));
                            if (file3.getParentFile().getParentFile().equals(kzyVar.a.b())) {
                                kzr.k(file3);
                                i2 = 3;
                            } else {
                                throw new IllegalStateException("File to remove is not a native library");
                            }
                        }
                    }
                    hashSet4.addAll(hashSet5);
                    i2 = 3;
                }
                lagVar.a(classLoader, hashSet4);
            } else {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    laa laaVar4 = (laa) it3.next();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    HashSet hashSet7 = new HashSet();
                    kzy.a(laaVar4, new kzt(kzyVar, laaVar4, hashSet7, atomicBoolean));
                    if (true != atomicBoolean.get()) {
                        hashSet7 = null;
                    }
                    if (hashSet7 == null) {
                        it3.remove();
                    } else {
                        lagVar.a(classLoader, hashSet7);
                    }
                }
            }
            HashSet hashSet8 = new HashSet();
            for (laa laaVar5 : hashSet3) {
                try {
                    zipFile2 = new ZipFile(laaVar5.a);
                } catch (IOException e) {
                    iOException = e;
                    zipFile = null;
                }
                try {
                    ZipEntry entry = zipFile2.getEntry("classes.dex");
                    zipFile2.close();
                    if (entry != null) {
                        kzr kzrVar3 = this.b;
                        String str6 = laaVar5.b;
                        File file4 = new File(kzrVar3.g(), "dex");
                        kzr.n(file4);
                        File a2 = kzr.a(file4, str6);
                        kzr.n(a2);
                        if (!lagVar.b(classLoader, a2, laaVar5.a, z)) {
                            Log.w("SplitCompat", "split was not installed ".concat(laaVar5.a.toString()));
                        }
                    }
                    hashSet8.add(laaVar5.a);
                } catch (IOException e2) {
                    iOException = e2;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, e3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    throw iOException;
                }
            }
            this.e.d(context, hashSet8);
            HashSet hashSet9 = new HashSet();
            for (laa laaVar6 : hashSet3) {
                if (hashSet8.contains(laaVar6.a)) {
                    hashSet9.add(laaVar6.b);
                } else {
                    String str7 = laaVar6.b;
                }
            }
            synchronized (this.c) {
                this.c.addAll(hashSet9);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }

    public final void a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kzr.k(this.b.f((String) it.next()));
        }
        lbi lbiVar = this.d;
        synchronized (lbi.class) {
            lbiVar.a().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }
}
