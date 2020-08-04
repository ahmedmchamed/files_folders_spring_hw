package com.codeclan.example.files_and_folders_hw.components;

import com.codeclan.example.files_and_folders_hw.models.File;
import com.codeclan.example.files_and_folders_hw.models.Folder;
import com.codeclan.example.files_and_folders_hw.models.User;
import com.codeclan.example.files_and_folders_hw.repositories.FileRepository;
import com.codeclan.example.files_and_folders_hw.repositories.FolderRepository;
import com.codeclan.example.files_and_folders_hw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User user1 = new User("SimonSaysWhaaaaaat");
        userRepository.save(user1);
        User user2 = new User("SayWhaaaaaat");
        userRepository.save(user2);
        User user3 = new User("NoGoAway");
        userRepository.save(user3);

        Folder folder1 = new Folder(user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder(user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder(user1);
        folderRepository.save(folder3);

        File file1 = new File("SecretStuff", ".rb", 10, folder1);
        fileRepository.save(file1);
        File file2 = new File("NotSecretStuff", ".js", 11, folder1);
        fileRepository.save(file2);
        File file3 = new File("ClassicWord", ".docx", 12, folder2);
        fileRepository.save(file3);
        File file4 = new File("ClassicExcel", ".xlsx", 13, folder2);
        fileRepository.save(file4);
        File file5 = new File("ClassicPowerPoint", ".pps", 14, folder3);
        fileRepository.save(file5);
        File file6 = new File("ClassicSomething", ".yo", 15, folder3);
        fileRepository.save(file6);
    }

}
