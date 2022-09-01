package com.google.android.libraries.assistant.soda;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
class AudioInput {
    private static final ltg a = ltg.j("com/google/android/libraries/assistant/soda/AudioInput");
    private static final boolean b;
    private final long c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;
    private final boolean k;
    private AudioRecord m;
    private ByteBuffer n;
    private ByteBuffer o;
    private final int p;
    private final boolean q;
    private int t;
    private int l = 0;
    private long r = 0;
    private long s = 0;
    private boolean u = false;

    static {
        b = Build.VERSION.SDK_INT >= 24;
    }

    public AudioInput(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.c = j;
        this.j = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.p = i6;
        this.q = z;
        this.k = z2;
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/AudioInput", "<init>", 138, "AudioInput.java")).U(Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    private final long a(int i) {
        this.t++;
        return this.r + (i * 1000);
    }

    private final void b() {
        AudioRecord audioRecord = this.m;
        if (audioRecord != null) {
            audioRecord.release();
            this.m = null;
        }
    }

    private final boolean c(int i, int i2, int i3) {
        try {
            AudioRecord build = new AudioRecord.Builder().setAudioSource(this.d).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(i).setEncoding(i2).build()).setBufferSizeInBytes(i3).build();
            this.m = build;
            if (build == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 346, "AudioInput.java")).t("Init: Cannot create AudioRecord instance!");
                return false;
            } else if (build.getState() == 1) {
                return true;
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 351, "AudioInput.java")).t("Init: AudioRecord instance state not INITIALIZED");
                b();
                return false;
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createAudioRecord", 342, "AudioInput.java")).w("Init: Cannot create AudioRecord instance: %s", e.getMessage());
            return false;
        }
    }

    private final boolean d(int i, int i2, int i3, int i4) {
        try {
            Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, Integer.TYPE, Integer.TYPE);
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
            AudioFormat build = new AudioFormat.Builder().setChannelMask(i).setEncoding(i2).setSampleRate(this.e).build();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            method.invoke(builder, Integer.valueOf(this.d));
            try {
                AudioRecord audioRecord = (AudioRecord) constructor.newInstance(builder.build(), build, Integer.valueOf(i3), Integer.valueOf(i4));
                this.m = audioRecord;
                if (audioRecord == null || audioRecord.getState() == 1) {
                    return true;
                }
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 407, "AudioInput.java")).t("Failed to initialize AudioRecord");
                b();
                return false;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 402, "AudioInput.java")).t("Exception while invoking new AudioRecord");
                return false;
            }
        } catch (Exception unused2) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createHotwordSourceAudioRecord", 413, "AudioInput.java")).u("Failed to construct AudioRecord for capture session %d", this.p);
            return false;
        }
    }

    private final boolean e(int i, int i2) {
        AudioRecord audioRecord;
        int i3 = this.i * 5;
        try {
            Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, Integer.TYPE, Integer.TYPE);
            Method method = AudioAttributes.Builder.class.getMethod("setInternalCapturePreset", Integer.TYPE);
            AudioFormat.Builder builder = new AudioFormat.Builder();
            try {
                if (i != 16 && i != 12) {
                    if (i == 15) {
                        builder.setChannelIndexMask(15);
                        builder.setEncoding(i2);
                        builder.setSampleRate(this.e);
                        AudioFormat build = builder.build();
                        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                        method.invoke(builder2, Integer.valueOf(this.d));
                        audioRecord = (AudioRecord) constructor.newInstance(builder2.build(), build, Integer.valueOf(i3), 0);
                        this.m = audioRecord;
                        if (audioRecord != null || audioRecord.getState() == 1) {
                            return true;
                        }
                        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 316, "AudioInput.java")).t("Failed to initialize AudioRecord for loopback");
                        b();
                        return false;
                    }
                    ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 292, "AudioInput.java")).u("Invalid loopback channelConfig: %d", i);
                    return false;
                }
                audioRecord = (AudioRecord) constructor.newInstance(builder2.build(), build, Integer.valueOf(i3), 0);
                this.m = audioRecord;
                if (audioRecord != null) {
                }
                return true;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 311, "AudioInput.java")).t("Exception while invoking new AudioRecord for loopback");
                return false;
            }
            builder.setChannelMask(i);
            builder.setEncoding(i2);
            builder.setSampleRate(this.e);
            AudioFormat build2 = builder.build();
            AudioAttributes.Builder builder22 = new AudioAttributes.Builder();
            method.invoke(builder22, Integer.valueOf(this.d));
        } catch (Exception unused2) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "createLoopbackAudioRecord", 322, "AudioInput.java")).t("Failed to construct AudioRecord for loopback session");
            return false;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private int readBuffer() {
        int read;
        int i;
        long a2;
        long j;
        long j2;
        this.n.clear();
        AudioRecord audioRecord = this.m;
        if (audioRecord == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 598, "AudioInput.java")).t("Cannot read audio, no audio record!");
            return -1;
        }
        if (this.k) {
            int capacity = this.n.capacity();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(capacity);
            read = 0;
            int i2 = 0;
            while (true) {
                if (this.u) {
                    break;
                }
                allocateDirect.clear();
                AudioRecord audioRecord2 = this.m;
                if (audioRecord2 == null) {
                    break;
                }
                int read2 = audioRecord2.read(allocateDirect, capacity - read, 1);
                if (read2 < 0) {
                    read = read2;
                    break;
                }
                if (read2 != 0) {
                    allocateDirect.position(read2);
                    allocateDirect.flip();
                    this.n.put(allocateDirect);
                    read += read2;
                    if (read == this.n.capacity()) {
                        break;
                    }
                    i2 = 0;
                } else {
                    i2++;
                    if (i2 >= 6) {
                        break;
                    }
                }
                try {
                    Thread.sleep(this.j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            ByteBuffer byteBuffer = this.n;
            read = audioRecord.read(byteBuffer, byteBuffer.capacity());
        }
        if (read < 0) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 608, "AudioInput.java")).u("ReadBuffer: read failed with error: %d", read);
            return -1;
        } else if (read == 0) {
            int i3 = this.l;
            if (i3 < 10) {
                this.l = i3 + 1;
                return 0;
            }
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "readBuffer", 612, "AudioInput.java")).t("ReadBuffer: too many consecutive zero byte buffers.");
            this.l = 0;
            return -1;
        } else {
            this.l = 0;
            this.o.position(0);
            ByteBuffer byteBuffer2 = this.o;
            int i4 = this.h;
            int i5 = read / ((this.e / 1000) * i4);
            long j3 = this.s;
            int i6 = read / i4;
            if (this.m == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "getTimestampUsec", 530, "AudioInput.java")).t("approximating timestamps, no audio record!");
                j2 = a(i5);
                i = read;
            } else {
                if (!b || this.t != 100) {
                    i = read;
                    a2 = a(i5);
                    j = j3 + i6;
                } else {
                    AudioTimestamp audioTimestamp = new AudioTimestamp();
                    int timestamp = this.m.getTimestamp(audioTimestamp, 1);
                    if (timestamp != 0) {
                        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "getTimestampUsec", 540, "AudioInput.java")).u("audioRecord.getTimestamp returned error %d, Estimating timestamps instead.", timestamp);
                        a2 = a(i5);
                        j = j3 + i6;
                        i = read;
                    } else {
                        j = j3 + i6;
                        long a3 = a(i5);
                        long currentTimeMillis = (System.currentTimeMillis() * 1000) - ((SystemClock.elapsedRealtimeNanos() / 1000) - (audioTimestamp.nanoTime / 1000));
                        if (audioTimestamp.framePosition == j) {
                            j = audioTimestamp.framePosition;
                            i = read;
                            a2 = currentTimeMillis;
                        } else {
                            long j4 = audioTimestamp.framePosition;
                            long j5 = (this.e * this.j) / 1000;
                            long j6 = j5 + j5;
                            long abs = Math.abs(j4 - j);
                            i = read;
                            long j7 = (1000000 * abs) / this.e;
                            long j8 = j4 < j ? currentTimeMillis + j7 : currentTimeMillis - j7;
                            if (abs > j6) {
                                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/AudioInput", "adjustTimestamps", 513, "AudioInput.java")).L("Adjusting timestamps: (framePos, timestamp) received(%d, %d) expected (%d, %d), adjusted timestamp %d", Long.valueOf(j4), Long.valueOf(currentTimeMillis), Long.valueOf(j), Long.valueOf(a3), Long.valueOf(j8));
                            }
                            a2 = j8;
                        }
                    }
                    this.t = 0;
                }
                j2 = a2;
                this.r = j2;
                this.s = j;
            }
            byteBuffer2.putLong(j2);
            int i7 = i;
            if (i7 != this.n.capacity()) {
                this.n.capacity();
            }
            return i7;
        }
    }

    private void stop() {
        this.u = true;
        if (this.m != null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/assistant/soda/AudioInput", "stop", 460, "AudioInput.java")).t("Stopping recording");
        }
        AudioRecord audioRecord = this.m;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        b();
        this.u = false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:(1:56)(3:57|9|10))|4|(1:(1:(3:8|9|10)(1:12))(1:53))(1:54)|13|14|15|16|(1:18)(3:19|(1:21)(2:35|(1:49)(4:39|(1:41)|42|(1:44)(2:45|(1:47)(1:48))))|(2:23|(4:27|28|29|30)(2:25|26)))|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0190, code lost:
        ((defpackage.ltd) ((defpackage.ltd) com.google.android.libraries.assistant.soda.AudioInput.a.c()).k("com/google/android/libraries/assistant/soda/AudioInput", "initialize", 197, "AudioInput.java")).w("Init: Cannot create mPcmBuffer: %s", r0.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean start() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.soda.AudioInput.start():boolean");
    }
}
