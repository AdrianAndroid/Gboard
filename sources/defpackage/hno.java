package defpackage;

import android.os.SystemClock;
import java.lang.Character;

/* compiled from: PG */
/* renamed from: hno  reason: default package */
/* loaded from: classes.dex */
public final class hno {
    private final hls a;
    private final boolean b;
    private int c = 0;
    private long d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private final idk h;

    public hno(hls hlsVar, boolean z) {
        this.a = hlsVar;
        this.b = z;
        this.h = hlsVar.hO();
    }

    static final boolean d(int i) {
        return i == 8205;
    }

    static final boolean e(int i) {
        return i >= 127462 && i <= 127487;
    }

    static final boolean f(int i) {
        return Character.UnicodeBlock.of(i) == Character.UnicodeBlock.TAGS;
    }

    static final boolean g(int i) {
        return i == 8288;
    }

    private static boolean i(int i) {
        if (i < 768 || i > 879) {
            if (i >= 6155 && i <= 6157) {
                return true;
            }
            if (i >= 6832 && i <= 6911) {
                return true;
            }
            if (i >= 7616 && i <= 7679) {
                return true;
            }
            if (i >= 8400 && i <= 8447) {
                return true;
            }
            if (i >= 65024 && i <= 65039) {
                return true;
            }
            if (i >= 65056 && i <= 65071) {
                return true;
            }
            if (i >= 127995 && i <= 127999) {
                return true;
            }
            return i >= 917760 && i <= 917999;
        }
        return true;
    }

    public final void a() {
        hls hlsVar = this.a;
        int i = -this.e;
        hlsVar.M(i, i);
        int i2 = this.f;
        if (i2 > 0 || this.g > 0) {
            this.a.f(i2, this.g, null);
        }
    }

    public final void b(xv xvVar) {
        this.c = 0;
        this.e = 0;
        Object obj = xvVar.a;
        this.f = obj == null ? 0 : ((Integer) obj).intValue();
        Object obj2 = xvVar.b;
        this.g = obj2 == null ? 0 : ((Integer) obj2).intValue();
        this.a.hW();
        hqk hT = this.a.hT(0, 0, 0);
        if (hT.e()) {
            int length = hT.b().length();
            int i = length / 2;
            this.a.M(i, -(length - i));
            this.a.G();
        }
    }

    public final void c(int i) {
        h(i);
        this.h.e(hlw.SCRUB_MOVE, new Object[0]);
    }

    public final void h(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = elapsedRealtime - this.d < 100 ? 2 : 1;
        int i3 = this.c;
        if (i != i3) {
            int i4 = (i - i3) * i2;
            if (this.b) {
                i4 = -i4;
            }
            int i5 = 0;
            if (i4 < 0) {
                int i6 = -i4;
                CharSequence j = this.a.j(i6 * 32);
                if (i6 != 0 && j.length() != 0) {
                    int length = j.length();
                    while (length > 0 && i6 > 0) {
                        int codePointBefore = Character.codePointBefore(j, length);
                        length -= Character.charCount(codePointBefore);
                        while (true) {
                            if (length > 0) {
                                int codePointBefore2 = Character.codePointBefore(j, length);
                                if (i(codePointBefore) || d(codePointBefore) || d(codePointBefore2) || f(codePointBefore) || g(codePointBefore)) {
                                    length -= Character.charCount(codePointBefore2);
                                    codePointBefore = codePointBefore2;
                                } else if (e(codePointBefore) && e(codePointBefore2)) {
                                    length -= Character.charCount(codePointBefore2);
                                }
                            }
                        }
                        i6--;
                    }
                    i5 = j.length() - length;
                }
                i5 = -i5;
            } else {
                CharSequence i7 = this.a.i(i4 * 32);
                if (i4 != 0 && i7 != null && i7.length() != 0) {
                    while (i5 < i7.length() && i4 > 0) {
                        int codePointAt = Character.codePointAt(i7, i5);
                        i5 += Character.charCount(codePointAt);
                        while (true) {
                            if (i5 < i7.length()) {
                                int codePointAt2 = Character.codePointAt(i7, i5);
                                if (i(codePointAt2) || d(codePointAt2) || d(codePointAt) || f(codePointAt2) || g(codePointAt)) {
                                    i5 += Character.charCount(codePointAt2);
                                    codePointAt = codePointAt2;
                                } else if (e(codePointAt2) && e(codePointAt)) {
                                    i5 += Character.charCount(codePointAt2);
                                }
                            }
                        }
                        i4--;
                    }
                }
            }
            this.a.M(i5, i5);
            this.e += i5;
            if (i5 != 0 && jam.w()) {
                this.a.O(hfd.d(new iay(-10091, null, null)));
            }
        }
        this.c = i;
        this.d = elapsedRealtime;
    }
}
