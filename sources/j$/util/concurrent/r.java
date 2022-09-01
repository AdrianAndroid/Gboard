package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends l {
    private static final j$.sun.misc.b h;
    private static final long i;
    s e;
    volatile s f;
    volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.b h2 = j$.sun.misc.b.h();
        h = h2;
        i = h2.j(r.class, "lockState");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        super(-2, null, null);
        int d;
        int i2;
        this.f = sVar;
        s sVar2 = null;
        while (sVar != null) {
            s sVar3 = (s) sVar.d;
            sVar.g = null;
            sVar.f = null;
            if (sVar2 == null) {
                sVar.e = null;
                sVar.i = false;
            } else {
                Object obj = sVar.b;
                int i3 = sVar.a;
                s sVar4 = sVar2;
                Class cls = null;
                while (true) {
                    Object obj2 = sVar4.b;
                    int i4 = sVar4.a;
                    i2 = i4 > i3 ? -1 : i4 < i3 ? 1 : ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d = ConcurrentHashMap.d(cls, obj, obj2)) == 0) ? i(obj, obj2) : d;
                    s sVar5 = i2 <= 0 ? sVar4.f : sVar4.g;
                    if (sVar5 == null) {
                        break;
                    }
                    sVar4 = sVar5;
                }
                sVar.e = sVar4;
                if (i2 <= 0) {
                    sVar4.f = sVar;
                } else {
                    sVar4.g = sVar;
                }
                sVar = c(sVar2, sVar);
            }
            sVar2 = sVar;
            sVar = sVar3;
        }
        this.e = sVar2;
    }

    static s b(s sVar, s sVar2) {
        while (sVar2 != null && sVar2 != sVar) {
            s sVar3 = sVar2.e;
            if (sVar3 == null) {
                sVar2.i = false;
                return sVar2;
            } else if (sVar2.i) {
                sVar2.i = false;
                return sVar;
            } else {
                s sVar4 = sVar3.f;
                s sVar5 = null;
                if (sVar4 == sVar2) {
                    sVar4 = sVar3.g;
                    if (sVar4 != null && sVar4.i) {
                        sVar4.i = false;
                        sVar3.i = true;
                        sVar = g(sVar, sVar3);
                        sVar3 = sVar2.e;
                        sVar4 = sVar3 == null ? null : sVar3.g;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar6 = sVar4.f;
                        s sVar7 = sVar4.g;
                        if ((sVar7 != null && sVar7.i) || (sVar6 != null && sVar6.i)) {
                            if (sVar7 == null || !sVar7.i) {
                                if (sVar6 != null) {
                                    sVar6.i = false;
                                }
                                sVar4.i = true;
                                sVar = h(sVar, sVar4);
                                sVar3 = sVar2.e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.g;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.i = sVar3 == null ? false : sVar3.i;
                                s sVar8 = sVar4.g;
                                if (sVar8 != null) {
                                    sVar8.i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.i = false;
                                sVar = g(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.i = true;
                        sVar2 = sVar3;
                    }
                } else {
                    if (sVar4 != null && sVar4.i) {
                        sVar4.i = false;
                        sVar3.i = true;
                        sVar = h(sVar, sVar3);
                        sVar3 = sVar2.e;
                        sVar4 = sVar3 == null ? null : sVar3.f;
                    }
                    if (sVar4 == null) {
                        sVar2 = sVar3;
                    } else {
                        s sVar9 = sVar4.f;
                        s sVar10 = sVar4.g;
                        if ((sVar9 != null && sVar9.i) || (sVar10 != null && sVar10.i)) {
                            if (sVar9 == null || !sVar9.i) {
                                if (sVar10 != null) {
                                    sVar10.i = false;
                                }
                                sVar4.i = true;
                                sVar = g(sVar, sVar4);
                                sVar3 = sVar2.e;
                                if (sVar3 != null) {
                                    sVar5 = sVar3.f;
                                }
                                sVar4 = sVar5;
                            }
                            if (sVar4 != null) {
                                sVar4.i = sVar3 == null ? false : sVar3.i;
                                s sVar11 = sVar4.f;
                                if (sVar11 != null) {
                                    sVar11.i = false;
                                }
                            }
                            if (sVar3 != null) {
                                sVar3.i = false;
                                sVar = h(sVar, sVar3);
                            }
                            sVar2 = sVar;
                            sVar = sVar2;
                        }
                        sVar4.i = true;
                        sVar2 = sVar3;
                    }
                }
            }
        }
        return sVar;
    }

    static s c(s sVar, s sVar2) {
        s sVar3;
        sVar2.i = true;
        while (true) {
            s sVar4 = sVar2.e;
            if (sVar4 == null) {
                sVar2.i = false;
                return sVar2;
            } else if (!sVar4.i || (sVar3 = sVar4.e) == null) {
                break;
            } else {
                s sVar5 = sVar3.f;
                if (sVar4 == sVar5) {
                    sVar5 = sVar3.g;
                    if (sVar5 == null || !sVar5.i) {
                        if (sVar2 == sVar4.g) {
                            sVar = g(sVar, sVar4);
                            s sVar6 = sVar4.e;
                            sVar3 = sVar6 == null ? null : sVar6.e;
                            sVar4 = sVar6;
                            sVar2 = sVar4;
                        }
                        if (sVar4 != null) {
                            sVar4.i = false;
                            if (sVar3 != null) {
                                sVar3.i = true;
                                sVar = h(sVar, sVar3);
                            }
                        }
                    } else {
                        sVar5.i = false;
                        sVar4.i = false;
                        sVar3.i = true;
                        sVar2 = sVar3;
                    }
                } else if (sVar5 == null || !sVar5.i) {
                    if (sVar2 == sVar4.f) {
                        sVar = h(sVar, sVar4);
                        s sVar7 = sVar4.e;
                        sVar3 = sVar7 == null ? null : sVar7.e;
                        sVar4 = sVar7;
                        sVar2 = sVar4;
                    }
                    if (sVar4 != null) {
                        sVar4.i = false;
                        if (sVar3 != null) {
                            sVar3.i = true;
                            sVar = g(sVar, sVar3);
                        }
                    }
                } else {
                    sVar5.i = false;
                    sVar4.i = false;
                    sVar3.i = true;
                    sVar2 = sVar3;
                }
            }
        }
        return sVar;
    }

    private final void d() {
        if (!h.c(this, i, 0, 1)) {
            boolean z = false;
            while (true) {
                int i2 = this.lockState;
                if ((i2 & (-3)) == 0) {
                    if (h.c(this, i, i2, 1)) {
                        break;
                    }
                } else if ((i2 & 2) == 0) {
                    if (h.c(this, i, i2, i2 | 2)) {
                        this.g = Thread.currentThread();
                        z = true;
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.g = null;
            }
        }
    }

    static s g(s sVar, s sVar2) {
        s sVar3 = sVar2.g;
        if (sVar3 != null) {
            s sVar4 = sVar3.f;
            sVar2.g = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.f == sVar2) {
                sVar5.f = sVar3;
            } else {
                sVar5.g = sVar3;
            }
            sVar3.f = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static s h(s sVar, s sVar2) {
        s sVar3 = sVar2.f;
        if (sVar3 != null) {
            s sVar4 = sVar3.g;
            sVar2.f = sVar4;
            if (sVar4 != null) {
                sVar4.e = sVar2;
            }
            s sVar5 = sVar2.e;
            sVar3.e = sVar5;
            if (sVar5 == null) {
                sVar3.i = false;
                sVar = sVar3;
            } else if (sVar5.g == sVar2) {
                sVar5.g = sVar3;
            } else {
                sVar5.f = sVar3;
            }
            sVar3.g = sVar2;
            sVar2.e = sVar3;
        }
        return sVar;
    }

    static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i2, Object obj) {
        Object obj2;
        Thread thread;
        Thread thread2;
        s sVar = null;
        if (obj != null) {
            l lVar = this.f;
            while (lVar != null) {
                int i3 = this.lockState;
                if ((i3 & 3) == 0) {
                    j$.sun.misc.b bVar = h;
                    long j = i;
                    if (bVar.c(this, j, i3, i3 + 4)) {
                        try {
                            s sVar2 = this.e;
                            if (sVar2 != null) {
                                sVar = sVar2.b(i2, obj, null);
                            }
                            if (bVar.f(this, j) == 6 && (thread2 = this.g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return sVar;
                        } catch (Throwable th) {
                            if (h.f(this, i) == 6 && (thread = this.g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (lVar.a == i2 && ((obj2 = lVar.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                } else {
                    lVar = lVar.d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.s e(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = 0
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.e = r9
            r1.f = r9
            goto La3
        L22:
            int r5 = r10.a
            r11 = 1
            if (r5 <= r0) goto L2a
            r5 = -1
            r12 = -1
            goto L69
        L2a:
            if (r5 >= r0) goto L2e
            r12 = 1
            goto L69
        L2e:
            java.lang.Object r5 = r10.b
            if (r5 == r4) goto Lab
            if (r5 == 0) goto L3c
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3c
            goto Lab
        L3c:
            if (r2 != 0) goto L44
            java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.c(r17)
            if (r2 == 0) goto L4a
        L44:
            int r6 = j$.util.concurrent.ConcurrentHashMap.d(r2, r4, r5)
            if (r6 != 0) goto L68
        L4a:
            if (r3 != 0) goto L62
            j$.util.concurrent.s r3 = r10.f
            if (r3 == 0) goto L56
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 != 0) goto L60
        L56:
            j$.util.concurrent.s r3 = r10.g
            if (r3 == 0) goto L61
            j$.util.concurrent.s r3 = r3.b(r0, r4, r2)
            if (r3 == 0) goto L61
        L60:
            return r3
        L61:
            r3 = 1
        L62:
            int r5 = i(r4, r5)
            r12 = r5
            goto L69
        L68:
            r12 = r6
        L69:
            if (r12 > 0) goto L6e
            j$.util.concurrent.s r5 = r10.f
            goto L70
        L6e:
            j$.util.concurrent.s r5 = r10.g
        L70:
            if (r5 != 0) goto La8
            j$.util.concurrent.s r13 = r1.f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f = r14
            if (r13 == 0) goto L88
            r13.h = r14
        L88:
            if (r12 > 0) goto L8d
            r10.f = r14
            goto L8f
        L8d:
            r10.g = r14
        L8f:
            boolean r0 = r10.i
            if (r0 != 0) goto L96
            r14.i = r11
            goto La3
        L96:
            r15.d()
            j$.util.concurrent.s r0 = r1.e     // Catch: java.lang.Throwable -> La4
            j$.util.concurrent.s r0 = c(r0, r14)     // Catch: java.lang.Throwable -> La4
            r1.e = r0     // Catch: java.lang.Throwable -> La4
            r1.lockState = r9
        La3:
            return r8
        La4:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        La8:
            r10 = r5
            goto Lc
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.e(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0065, B:34:0x006b, B:35:0x006d, B:41:0x008e, B:44:0x009f, B:45:0x0096, B:47:0x009a, B:48:0x009d, B:49:0x00a5, B:52:0x00ae, B:54:0x00b2, B:56:0x00b6, B:58:0x00ba, B:59:0x00c3, B:61:0x00bd, B:63:0x00c1, B:66:0x00aa, B:68:0x0077, B:70:0x007b, B:71:0x007e, B:72:0x0052, B:74:0x0058, B:76:0x005c, B:77:0x005f, B:78:0x0061), top: B:20:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(j$.util.concurrent.s r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.r.f(j$.util.concurrent.s):boolean");
    }
}
