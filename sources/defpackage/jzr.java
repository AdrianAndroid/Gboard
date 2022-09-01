package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: jzr  reason: default package */
/* loaded from: classes.dex */
public final class jzr implements Closeable, jzs {
    public final jzv a;
    private final byte[] b;
    private final jzt c = jzu.a();
    private final now d;
    private final File e;
    private final lgb f;
    private jry g;

    public jzr(File file, lgb lgbVar) {
        byte[] bArr = new byte[1024];
        this.b = bArr;
        this.a = new jzv(bArr);
        this.e = file;
        this.d = new now(file);
        this.f = lgbVar;
    }

    public final synchronized jzu a() {
        jzt jztVar;
        jztVar = this.c;
        jztVar.h(jztVar.b());
        jztVar.i(this.e.length());
        jztVar.j(this.d.a());
        return jztVar.c();
    }

    public final synchronized void b(String str, String str2, String str3, int i, int i2, long j, Object... objArr) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.g();
            this.a.h(i);
            this.a.j(str);
            this.a.j(str2);
            this.a.j(str3);
            this.a.i(((Long) this.f.a()).longValue());
            if (i == 3) {
                this.a.i(j);
            } else if (i == 4) {
                this.a.h(i2);
            }
            this.a.h(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Byte) {
                    this.a.h(1);
                    this.a.h(((Byte) obj).byteValue());
                } else if (obj instanceof Integer) {
                    this.a.h(2);
                    jzv jzvVar = this.a;
                    int intValue = ((Integer) obj).intValue();
                    jzvVar.f(4);
                    byte[] bArr = jzvVar.a;
                    int i3 = jzvVar.c;
                    int i4 = i3 + 1;
                    jzvVar.c = i4;
                    bArr[i3] = (byte) (intValue >> 24);
                    int i5 = i4 + 1;
                    jzvVar.c = i5;
                    bArr[i4] = (byte) ((intValue >>> 16) & 255);
                    int i6 = i5 + 1;
                    jzvVar.c = i6;
                    bArr[i5] = (byte) ((intValue >>> 8) & 255);
                    jzvVar.c = i6 + 1;
                    bArr[i6] = (byte) (intValue & 255);
                } else if (obj instanceof Long) {
                    this.a.h(3);
                    this.a.i(((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    this.a.h(4);
                    this.a.h(((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof String) {
                    this.a.h(5);
                    this.a.j((String) obj);
                } else {
                    throw new IllegalArgumentException("Unknown arg type: " + String.valueOf(obj.getClass()));
                }
            }
            this.d.h(this.b, this.a.b());
            now nowVar = this.d;
            if (nowVar.a() > 1024) {
                nowVar.d();
            }
            this.c.d(this.a.b(), SystemClock.elapsedRealtime() - elapsedRealtime);
        } catch (Throwable unused) {
            if (this.g == null) {
                return;
            }
            jsf jsfVar = jsf.a;
            lug lugVar = jsh.a;
        }
    }

    @Override // defpackage.jzs
    public final synchronized void c(final jzo jzoVar) {
        this.d.i(new nov() { // from class: jzq
            @Override // defpackage.nov
            public final void a(InputStream inputStream, int i) {
                long j;
                int i2;
                int i3;
                long j2;
                jzr jzrVar = jzr.this;
                jzo jzoVar2 = jzoVar;
                synchronized (jzrVar) {
                    jzrVar.a.g();
                    jzv jzvVar = jzrVar.a;
                    jzvVar.f(i);
                    jzvVar.c += inputStream.read(jzvVar.a, 0, i);
                    int a = jzrVar.a.a();
                    String d = jzrVar.a.d();
                    String d2 = jzrVar.a.d();
                    String d3 = jzrVar.a.d();
                    long c = jzrVar.a.c();
                    if (a == 3) {
                        j = jzrVar.a.c();
                        a = 3;
                    } else {
                        j = 0;
                    }
                    if (a == 4) {
                        int a2 = jzrVar.a.a();
                        if (a2 != 1 && a2 != 2 && a2 != 3) {
                            throw new IOException("Unknown trace scope: " + a2);
                        }
                        i2 = a2;
                        a = 4;
                    } else {
                        i2 = 0;
                    }
                    int a3 = jzrVar.a.a();
                    if (a3 > 16 || a3 < 0) {
                        throw new IOException("Invalid number of arguments: " + a3);
                    }
                    Object[] objArr = new Object[a3];
                    int i4 = 0;
                    while (i4 < a3) {
                        int a4 = jzrVar.a.a();
                        if (a4 == 1) {
                            i3 = a3;
                            j2 = j;
                            objArr[i4] = Integer.valueOf(jzrVar.a.a());
                        } else if (a4 != 2) {
                            if (a4 == 3) {
                                objArr[i4] = Long.valueOf(jzrVar.a.c());
                            } else if (a4 == 4) {
                                objArr[i4] = Boolean.valueOf(jzrVar.a.a() == 1);
                            } else if (a4 == 5) {
                                objArr[i4] = jzrVar.a.d();
                            } else {
                                throw new IOException("Unsupported arg type: " + objArr.getClass().getName());
                            }
                            i3 = a3;
                            j2 = j;
                        } else {
                            jzv jzvVar2 = jzrVar.a;
                            jzvVar2.e(4);
                            byte[] bArr = jzvVar2.a;
                            i3 = a3;
                            int i5 = jzvVar2.b;
                            j2 = j;
                            int i6 = i5 + 1;
                            jzvVar2.b = i6;
                            int i7 = i6 + 1;
                            jzvVar2.b = i7;
                            int i8 = ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16);
                            int i9 = i7 + 1;
                            jzvVar2.b = i9;
                            int i10 = i8 | ((bArr[i7] & 255) << 8);
                            jzvVar2.b = i9 + 1;
                            objArr[i4] = Integer.valueOf((bArr[i9] & 255) | i10);
                        }
                        i4++;
                        a3 = i3;
                        j = j2;
                    }
                    long j3 = j;
                    if (a == 1) {
                        jzoVar2.a(1, d, d2, d3, c, 0, 0L, objArr);
                    } else if (a == 2) {
                        jzoVar2.a(2, d, d2, d3, c, 0, 0L, objArr);
                    } else if (a == 3) {
                        jzoVar2.a(3, d, d2, d3, c, 0, j3, objArr);
                    } else if (a == 4) {
                        jzoVar2.a(4, d, d2, d3, c, i2, 0L, objArr);
                    } else {
                        throw new IOException("Unknown trace type: " + a);
                    }
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d.close();
    }

    public final synchronized void d(jry jryVar) {
        this.g = jryVar;
    }
}
