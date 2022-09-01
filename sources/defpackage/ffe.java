package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.inputmethod.latin.R;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ffe  reason: default package */
/* loaded from: classes.dex */
public final class ffe implements AudioTrack.OnPlaybackPositionUpdateListener {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceSoundManager");
    private static final byte[] b = new byte[0];
    private final Context c;

    public ffe(Context context) {
        this.c = context;
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceSoundManager", "closeTargetSilently", 'w', "VoiceSoundManager.java")).t("Failed to close target");
            }
        }
    }

    public final synchronized void a() {
        byte[] bArr;
        AssetFileDescriptor openRawResourceFd = this.c.getResources().openRawResourceFd(R.raw.f147450_resource_name_obfuscated_res_0x7f130062);
        int i = 0;
        if (openRawResourceFd.getLength() > 2147483647L) {
            b(openRawResourceFd);
            bArr = b;
        } else {
            int length = (int) openRawResourceFd.getLength();
            byte[] bArr2 = new byte[length];
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = openRawResourceFd.createInputStream();
                if (lyp.a(fileInputStream, bArr2, 0, length) != length) {
                    bArr2 = b;
                    b(fileInputStream);
                } else {
                    b(fileInputStream);
                }
            } catch (IOException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceSoundManager", "loadSound", 'g', "VoiceSoundManager.java")).t("Failed to load sound");
                bArr2 = b;
                b(fileInputStream);
            }
            b(openRawResourceFd);
            bArr = bArr2;
        }
        if (bArr == b) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceSoundManager", "playSound", 38, "VoiceSoundManager.java")).t("Invalid sound; cannot play");
            return;
        }
        int length2 = bArr.length;
        AudioTrack audioTrack = new AudioTrack(new AudioAttributes.Builder().setContentType(4).setUsage(13).build(), new AudioFormat.Builder().setSampleRate(16000).setChannelMask(4).setEncoding(2).build(), length2, 1, 0);
        if (audioTrack.getState() != 1) {
            return;
        }
        while (i < length2) {
            int write = audioTrack.write(bArr, i, bArr.length);
            if (write <= 0) {
                break;
            }
            i += write;
        }
        audioTrack.play();
        audioTrack.setNotificationMarkerPosition(length2 >> 1);
        audioTrack.setPlaybackPositionUpdateListener(this);
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
        audioTrack.release();
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
