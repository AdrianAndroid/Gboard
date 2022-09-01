package defpackage;

import android.os.PersistableBundle;

/* compiled from: PG */
/* renamed from: isn  reason: default package */
/* loaded from: classes.dex */
public final class isn {
    private static final long q = iso.f;
    private static final long r = iso.h;
    public final String a;
    public final String b;
    public int c = 0;
    public long d = -1;
    public long e = -1;
    public boolean f = false;
    public long g = -1;
    public long h = -1;
    public PersistableBundle i = PersistableBundle.EMPTY;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public boolean m = false;
    public long n = -1;
    public long o = -1;
    public boolean p = false;

    public isn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void b() {
        this.p = true;
    }

    public final void c(long j, long j2) {
        if (j < 1) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRequiredPeriodic", 387, "TaskSpec.java")).v("Period millis %d must be positive.", j);
        } else if (j > iso.i) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRequiredPeriodic", 391, "TaskSpec.java")).v("Period millis %d is too long.", j);
        } else {
            long j3 = q;
            if (j < j3) {
                this.g = j3;
                ((ltd) ((ltd) iso.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRequiredPeriodic", 397, "TaskSpec.java")).v("The periodic time will be set as the min interval %s", j3);
            } else {
                this.g = j;
            }
            long j4 = r;
            if (j2 < j4) {
                this.h = j4;
                ((ltd) ((ltd) iso.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRequiredPeriodic", 405, "TaskSpec.java")).v("The flex time will be set as the min interval %s", j4);
            } else {
                this.h = j2;
            }
            if (this.h < this.g) {
                this.f = true;
                return;
            }
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRequiredPeriodic", 411, "TaskSpec.java")).B("Flex millis %d must be less than period millis %d.", this.h, this.g);
            this.h = -1L;
        }
    }

    public final void d(int i, long j, long j2) {
        if (i == 0) {
            this.c = 0;
            this.d = -1L;
            this.e = -1L;
            return;
        }
        if (j <= iso.c) {
            ((ltd) ((ltd) iso.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRetryStrategy", 327, "TaskSpec.java")).v("Initial retry millis (%s) must be at least 30 seconds, set as 30 seconds.", j);
            j = iso.b;
        }
        long j3 = j;
        if (j2 < iso.e) {
            ((ltd) ((ltd) iso.a.d()).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRetryStrategy", 334, "TaskSpec.java")).v("Max retry millis (%s) must be greater than 5 minutes, set as 5 hours.", j2);
            j2 = iso.d;
        }
        long j4 = j2;
        if (j4 > iso.i) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRetryStrategy", 340, "TaskSpec.java")).v("Max retry millis (%d) is too long.", j4);
        } else if (j3 > j4) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "setRetryStrategy", 344, "TaskSpec.java")).B("Initial retry millis (%d) cannot be larger than max retry millis (%d).", j3, j4);
        } else {
            this.c = 1;
            this.d = j3;
            this.e = j4;
        }
    }

    public final void e(long j) {
        c(j, ((float) j) * 0.1f);
    }

    public final iso a() {
        if (!this.f) {
            if (this.j || this.k != 0 || this.l || this.m || this.n != -1 || this.o != -1) {
                long j = this.n;
                if (j != -1 && j < this.o) {
                    ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "build", 575, "TaskSpec.java")).B("Max execution delay (%d) cannot be less than min delay (%d).", this.n, this.o);
                    this.n = -1L;
                    this.o = -1L;
                }
            } else {
                this.n = iso.g;
            }
        } else if (this.n != -1 || this.o != -1) {
            ((ltd) iso.a.a(hip.a).k("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec$Builder", "build", 567, "TaskSpec.java")).t("Cannot set max execution delay or min delay for periodic task.");
            this.n = -1L;
            this.o = -1L;
        }
        return new iso(this);
    }
}
