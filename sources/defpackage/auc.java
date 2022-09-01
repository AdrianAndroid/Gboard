package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: auc  reason: default package */
/* loaded from: classes.dex */
public final class auc implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public Writer f;
    public int h;
    private final File j;
    public long e = 0;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new atz());
    private final Callable n = new aty(this, 0);
    private final int k = 1;
    public final int d = 1;
    private final long l = 262144000;

    public auc(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
    }

    public static void b(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException();
    }

    public static void e(File file, File file2, boolean z) {
        if (z) {
            b(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private final void k() {
        if (this.f != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    private static void l(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void m(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final synchronized void a(aua auaVar, boolean z) {
        aub aubVar = auaVar.a;
        if (aubVar.f != auaVar) {
            throw new IllegalStateException();
        }
        if (z && !aubVar.e) {
            for (int i = 0; i < this.d; i = 1) {
                if (auaVar.b[0]) {
                    if (!aubVar.d().exists()) {
                        auaVar.a();
                        return;
                    }
                } else {
                    auaVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index 0");
                }
            }
        }
        for (int i2 = 0; i2 < this.d; i2 = 1) {
            File d = aubVar.d();
            if (z) {
                if (d.exists()) {
                    File c = aubVar.c();
                    d.renameTo(c);
                    long j = aubVar.b[0];
                    long length = c.length();
                    aubVar.b[0] = length;
                    this.e = (this.e - j) + length;
                }
            } else {
                b(d);
            }
        }
        this.h++;
        aubVar.f = null;
        if (aubVar.e | z) {
            aubVar.e = true;
            this.f.append((CharSequence) "CLEAN");
            this.f.append(' ');
            this.f.append((CharSequence) aubVar.a);
            this.f.append((CharSequence) aubVar.a());
            this.f.append('\n');
            if (z) {
                this.m++;
            }
        } else {
            this.g.remove(aubVar.a);
            this.f.append((CharSequence) "REMOVE");
            this.f.append(' ');
            this.f.append((CharSequence) aubVar.a);
            this.f.append('\n');
        }
        m(this.f);
        if (this.e <= this.l && !g()) {
            return;
        }
        this.i.submit(this.n);
    }

    public final void c() {
        String a;
        String substring;
        aue aueVar = new aue(new FileInputStream(this.b), auf.a);
        try {
            String a2 = aueVar.a();
            String a3 = aueVar.a();
            String a4 = aueVar.a();
            String a5 = aueVar.a();
            String a6 = aueVar.a();
            if ("libcore.io.DiskLruCache".equals(a2) && "1".equals(a3) && Integer.toString(this.k).equals(a4) && Integer.toString(this.d).equals(a5) && "".equals(a6)) {
                int i = 0;
                while (true) {
                    try {
                        a = aueVar.a();
                        int indexOf = a.indexOf(32);
                        if (indexOf != -1) {
                            int i2 = indexOf + 1;
                            int indexOf2 = a.indexOf(32, i2);
                            if (indexOf2 == -1) {
                                substring = a.substring(i2);
                                if (indexOf == 6) {
                                    if (a.startsWith("REMOVE")) {
                                        this.g.remove(substring);
                                        i++;
                                    } else {
                                        indexOf = 6;
                                    }
                                }
                            } else {
                                substring = a.substring(i2, indexOf2);
                            }
                            aub aubVar = (aub) this.g.get(substring);
                            if (aubVar == null) {
                                aubVar = new aub(this, substring);
                                this.g.put(substring, aubVar);
                            }
                            if (indexOf2 != -1 && indexOf == 5) {
                                if (a.startsWith("CLEAN")) {
                                    String[] split = a.substring(indexOf2 + 1).split(" ");
                                    aubVar.e = true;
                                    aubVar.f = null;
                                    if (split.length == aubVar.g.d) {
                                        for (int i3 = 0; i3 < split.length; i3++) {
                                            try {
                                                aubVar.b[i3] = Long.parseLong(split[i3]);
                                            } catch (NumberFormatException unused) {
                                                throw aub.e(split);
                                            }
                                        }
                                        i++;
                                    } else {
                                        throw aub.e(split);
                                    }
                                } else {
                                    indexOf = 5;
                                }
                            }
                            if (indexOf2 == -1 && indexOf == 5 && a.startsWith("DIRTY")) {
                                aubVar.f = new aua(this, aubVar);
                            } else if (indexOf2 != -1 || indexOf != 4 || !a.startsWith("READ")) {
                                break;
                            }
                            i++;
                        } else {
                            throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                        }
                    } catch (EOFException unused2) {
                        this.h = i - this.g.size();
                        if (aueVar.b == -1) {
                            d();
                        } else {
                            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), auf.a));
                        }
                        auf.a(aueVar);
                        return;
                    }
                }
                throw new IOException("unexpected journal line: ".concat(String.valueOf(a)));
            }
            throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
        } catch (Throwable th) {
            auf.a(aueVar);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aua auaVar = ((aub) arrayList.get(i)).f;
            if (auaVar != null) {
                auaVar.a();
            }
        }
        f();
        l(this.f);
        this.f = null;
    }

    public final synchronized void d() {
        Writer writer = this.f;
        if (writer != null) {
            l(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), auf.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (aub aubVar : this.g.values()) {
            if (aubVar.f == null) {
                String str = aubVar.a;
                String a = aubVar.a();
                bufferedWriter.write("CLEAN " + str + a + "\n");
            } else {
                String str2 = aubVar.a;
                bufferedWriter.write("DIRTY " + str2 + "\n");
            }
        }
        l(bufferedWriter);
        if (this.b.exists()) {
            e(this.b, this.j, true);
        }
        e(this.c, this.b, false);
        this.j.delete();
        this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), auf.a));
    }

    public final void f() {
        while (this.e > this.l) {
            i((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }

    public final boolean g() {
        int i = this.h;
        return i >= 2000 && i >= this.g.size();
    }

    public final synchronized aua h(String str) {
        k();
        aub aubVar = (aub) this.g.get(str);
        if (aubVar == null) {
            aubVar = new aub(this, str);
            this.g.put(str, aubVar);
        } else if (aubVar.f != null) {
            return null;
        }
        aua auaVar = new aua(this, aubVar);
        aubVar.f = auaVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        m(this.f);
        return auaVar;
    }

    public final synchronized void i(String str) {
        k();
        aub aubVar = (aub) this.g.get(str);
        if (aubVar == null || aubVar.f != null) {
            return;
        }
        for (int i = 0; i < this.d; i = 1) {
            File c = aubVar.c();
            if (c.exists() && !c.delete()) {
                throw new IOException("failed to delete ".concat(String.valueOf(String.valueOf(c))));
            }
            long j = this.e;
            long[] jArr = aubVar.b;
            this.e = j - jArr[0];
            jArr[0] = 0;
        }
        this.h++;
        this.f.append((CharSequence) "REMOVE");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        this.g.remove(str);
        if (!g()) {
            return;
        }
        this.i.submit(this.n);
    }

    public final synchronized aqq j(String str) {
        k();
        aub aubVar = (aub) this.g.get(str);
        if (aubVar == null) {
            return null;
        }
        if (!aubVar.e) {
            return null;
        }
        File[] fileArr = aubVar.c;
        int length = fileArr.length;
        for (int i = 0; i < length; i = 1) {
            if (!fileArr[0].exists()) {
                return null;
            }
        }
        this.h++;
        this.f.append((CharSequence) "READ");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append('\n');
        if (g()) {
            this.i.submit(this.n);
        }
        return new aqq(aubVar.c);
    }
}
