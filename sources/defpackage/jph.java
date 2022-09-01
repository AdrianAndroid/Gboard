package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: jph  reason: default package */
/* loaded from: classes.dex */
public final class jph implements jqb {
    public static final /* synthetic */ int c = 0;
    public final jpw a;
    private final jvr e;
    public final ReentrantLock b = new ReentrantLock();
    private final String f = "manifests";

    public jph(jvr jvrVar, jpw jpwVar) {
        this.e = jvrVar;
        this.a = jpwVar;
    }

    @Override // defpackage.jqb
    public final jqm a(String str, int i) {
        return b(str, i, false);
    }

    @Override // defpackage.jqb
    public final jqm b(String str, int i, boolean z) {
        File h = this.e.h(jsr.d(this.f, jsi.d(str, i)));
        if (h.isDirectory()) {
            jru jruVar = this.e.g;
            List e = jru.e(h);
            if (!e.isEmpty()) {
                if (e.size() > 1) {
                    ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 83, "FileManifestStore.java")).t("Unexpectedly got more than one file after uncompressing a manifest");
                    return null;
                }
                h = (File) e.get(0);
            } else {
                ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 88, "FileManifestStore.java")).t("Got a compressed manifest but no files after uncompressing");
                return null;
            }
        }
        return this.a.a(str, i, h, z);
    }

    @Override // defpackage.jqb
    public final void c(String str, Set set, int i) {
        ReentrantLock reentrantLock;
        this.b.lock();
        try {
            lug lugVar = jsh.a;
            File i2 = this.e.i(this.f);
            jru jruVar = this.e.g;
            List<File> e = jru.e(i2);
            if (e.isEmpty()) {
                lug lugVar2 = jsh.a;
                reentrantLock = this.b;
            } else {
                ArrayList<File> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (File file : e) {
                    jtr c2 = jsi.c(file.getName());
                    if (c2 != null) {
                        if (!set.contains(Integer.valueOf(((jrn) c2).b)) && str.equals(((jrn) c2).a)) {
                            lug lugVar3 = jsh.a;
                            arrayList2.add(file);
                        }
                    } else {
                        arrayList.add(file);
                    }
                }
                int size = arrayList2.size();
                lug lugVar4 = jsh.a;
                if (size > i) {
                    Collections.sort(arrayList2, jpf.a);
                    arrayList.addAll(arrayList2.subList(i, arrayList2.size()));
                }
                for (File file2 : arrayList) {
                    ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/FileManifestStore", "collectGarbage", 150, "FileManifestStore.java")).G("Deleting file %s from manifest directory, last modified: %s", file2, jtq.e(file2.lastModified()));
                    this.e.n(jsr.d(this.f, file2.getName()), true, jxz.MANIFEST_GC);
                }
                reentrantLock = this.b;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void d(jnf jnfVar) {
        kdw kdwVar = new kdw(jnfVar, 1);
        File i = this.e.i(this.f);
        if (!i.exists()) {
            return;
        }
        File[] listFiles = i.listFiles();
        if (listFiles == null) {
            throw new IOException("Failed to list manifest files in directory: ".concat(i.toString()));
        }
        Arrays.sort(listFiles, jpf.c);
        int i2 = 0;
        for (File file : listFiles) {
            jtr c2 = jsi.c(file.getName());
            if (c2 != null) {
                i2 += Boolean.TRUE.equals(kdwVar.a(c2)) ? 1 : 0;
            }
            if (i2 == Integer.MAX_VALUE) {
                return;
            }
        }
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        printWriter.println("## File Manifest store");
        printWriter.printf("- manifests namespace: %s\n", this.f);
        printWriter.println();
        this.a.e(printWriter, z);
    }
}
