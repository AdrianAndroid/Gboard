package defpackage;

import android.content.Context;
import java.io.File;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: PG */
/* renamed from: dlt  reason: default package */
/* loaded from: classes.dex */
public final class dlt {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils");

    public static File a(Context context, boolean z) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        File file = new File(cacheDir, "input_action");
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            jan.b.e(file);
        }
        if (z && file.mkdir()) {
            return file;
        }
        return null;
    }

    public static SecretKey b() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "generateKey", 233, "InputActionCollectorUtils.java")).w("Failed to get key generator for %s.", "AES");
            return null;
        }
    }

    public static byte[] c(SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            try {
                cipher.init(1, secretKey, ivParameterSpec);
                try {
                    return cipher.doFinal(bArr);
                } catch (BadPaddingException | IllegalBlockSizeException e) {
                    ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "encrypt", (char) 258, "InputActionCollectorUtils.java")).t("Failed to encrypt data.");
                    return null;
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "encrypt", (char) 252, "InputActionCollectorUtils.java")).t("Failed to init cipher.");
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e3)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "encrypt", 246, "InputActionCollectorUtils.java")).w("Failed to get cipher for %s.", "AES/CBC/PKCS5PADDING");
            return null;
        }
    }

    public static byte[] d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/keyhound/InputActionCollectorUtils", "genDigest", 202, "InputActionCollectorUtils.java")).w("Failed to get message digest for %s.", "SHA-256");
            return null;
        }
    }
}
